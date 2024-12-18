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
package org.apache.camel.pgevent.integration;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class PgEventPubSubIT extends PgEventITSupport {

    @EndpointInject("timer://test?repeatCount=1&period=1")
    private Endpoint timerEndpoint;

    @EndpointInject("mock:result")
    private MockEndpoint mockEndpoint;

    @Test
    public void testPgEventPublishSubscribe() throws Exception {
        mockEndpoint.expectedBodiesReceived(TEST_MESSAGE_BODY);
        mockEndpoint.assertIsSatisfied(5000);
    }

    @Override
    protected RoutesBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from(timerEndpoint)
                        .setBody(constant(TEST_MESSAGE_BODY))
                        .to(String.format(
                                "pgevent://%s:%s/%s/testchannel?user=%s&pass=%s", getHost(), getMappedPort(), POSTGRES_DB,
                                POSTGRES_USER, POSTGRES_PASSWORD));

                from(String.format("pgevent://%s:%s/%s/testchannel?user=%s&pass=%s",
                        getHost(), getMappedPort(), POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD))
                        .to(mockEndpoint);
            }
        };
    }
}
