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
package org.apache.camel.component.jetty;

import org.apache.camel.Exchange;
import org.apache.camel.spi.Metadata;

public final class JettyHttpConstants {

    @Metadata(description = "The servlet context path used", javaType = "String")
    public static final String SERVLET_CONTEXT_PATH = "CamelServletContextPath";
    @Metadata(description = "Request URI's path, the header will be used to build the request URI\n" +
                            "with the HTTP_URI.",
              javaType = "String")
    public static final String HTTP_PATH = Exchange.HTTP_PATH;

    private JettyHttpConstants() {
    }
}
