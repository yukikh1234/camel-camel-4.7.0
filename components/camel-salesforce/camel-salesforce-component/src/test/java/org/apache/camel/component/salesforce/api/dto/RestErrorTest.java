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
package org.apache.camel.component.salesforce.api.dto;

import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import org.apache.camel.component.salesforce.api.utils.JsonUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestErrorTest {

    RestError error = new RestError("errorCode", "message", Arrays.asList("field1", "field2"));

    @Test
    public void shouldDeserializeFromJson() throws Exception {
        final ObjectMapper objectMapper = JsonUtils.createObjectMapper();
        final ObjectReader reader = objectMapper.readerFor(RestError.class);

        final RestError gotWithErrorCode = reader.<RestError> readValue(
                "{\"errorCode\":\"errorCode\",\"message\":\"message\",\"fields\":[ \"field1\",\"field2\" ]}");
        assertEquals(gotWithErrorCode, error);

        final RestError gotWithStatusCode = reader.<RestError> readValue(
                "{\"statusCode\":\"errorCode\",\"message\":\"message\",\"fields\":[ \"field1\",\"field2\" ]}");
        assertEquals(gotWithStatusCode, error);
    }
}
