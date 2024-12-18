/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.smooks;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.smooks.support.StreamUtils;
import org.xmlunit.builder.DiffBuilder;

import static org.apache.camel.component.mock.MockEndpoint.assertIsSatisfied;
import static org.apache.camel.test.junit5.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class SmooksComponentTest extends CamelTestSupport {

    @EndpointInject(value = "mock:result")
    private MockEndpoint mockEndpoint;

    @Test
    public void unmarshalEdi() throws Exception {
        mockEndpoint.expectedMessageCount(1);
        assertIsSatisfied(mockEndpoint);

        Exchange exchange = mockEndpoint.assertExchangeReceived(0);

        assertIsInstanceOf(Document.class, exchange.getIn().getBody());
        assertFalse(DiffBuilder
                .compare(StreamUtils.readStreamAsString(getClass().getResourceAsStream("/xml/expected-order.xml"), "UTF-8"))
                .withTest(exchange.getIn().getBody(String.class)).ignoreComments().ignoreWhitespace().build().hasDifferences());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("file://src/test/resources/data?noop=true")
                        .to("smooks://edi-to-xml-smooks-config.xml")
                        .convertBodyTo(Node.class).to("mock:result");
            }
        };
    }
}
