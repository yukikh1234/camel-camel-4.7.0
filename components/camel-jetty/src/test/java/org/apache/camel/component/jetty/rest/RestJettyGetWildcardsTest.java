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
package org.apache.camel.component.jetty.rest;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jetty.BaseJettyTest;
import org.apache.camel.component.jetty.JettyRestHttpBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestJettyGetWildcardsTest extends BaseJettyTest {

    @BindToRegistry("mybinding")
    private JettyRestHttpBinding binding = new JettyRestHttpBinding();

    @Test
    public void testJettyProducerGet() {
        String out = template.requestBody("http://localhost:" + getPort() + "/users/123/basic", null, String.class);
        assertEquals("123;Donald Duck", out);
    }

    @Test
    public void testJettyProducerGetWildcards() {
        String out = template.requestBody("http://localhost:" + getPort() + "/users/456/name=g*", null, String.class);
        assertEquals("456;Goofy", out);
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // configure to use jetty on localhost with the given port
                restConfiguration().component("jetty").host("localhost").port(getPort()).endpointProperty("httpBindingRef",
                        "#mybinding");

                // use the rest DSL to define the rest services
                rest("/users/")
                        .get("{id}/basic").to("direct:basic")
                        .get("{id}/{query}").to("direct:query");

                from("direct:basic").to("mock:input").process(new Processor() {
                    public void process(Exchange exchange) {
                        String id = exchange.getIn().getHeader("id", String.class);
                        exchange.getMessage().setBody(id + ";Donald Duck");
                    }
                });
                from("direct:query").to("mock:query").process(new Processor() {
                    public void process(Exchange exchange) {
                        String id = exchange.getIn().getHeader("id", String.class);
                        exchange.getMessage().setBody(id + ";Goofy");
                    }
                });
            }
        };
    }

}
