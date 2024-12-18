/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.mybatis.MyBatisComponent;

/**
 * Performs a query, poll, insert, update or delete in a relational database
 * using MyBatis.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MybatisComponentBuilderFactory {

    /**
     * MyBatis (camel-mybatis)
     * Performs a query, poll, insert, update or delete in a relational database
     * using MyBatis.
     * 
     * Category: database
     * Since: 2.7
     * Maven coordinates: org.apache.camel:camel-mybatis
     * 
     * @return the dsl builder
     */
    static MybatisComponentBuilder mybatis() {
        return new MybatisComponentBuilderImpl();
    }

    /**
     * Builder for the MyBatis component.
     */
    interface MybatisComponentBuilder extends ComponentBuilder<MyBatisComponent> {
    
        
        /**
         * Location of MyBatis xml configuration file. The default value is:
         * SqlMapConfig.xml loaded from the classpath.
         * 
         * This option can also be loaded from an existing file, by prefixing
         * with file: or classpath: followed by the location of the file.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: SqlMapConfig.xml
         * Group: common
         * 
         * @param configurationUri the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder configurationUri(java.lang.String configurationUri) {
            doSetProperty("configurationUri", configurationUri);
            return this;
        }
    
        
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder bridgeErrorHandler(boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    
        
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    
        
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    
        /**
         * To use the SqlSessionFactory.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.ibatis.session.SqlSessionFactory&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param sqlSessionFactory the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder sqlSessionFactory(org.apache.ibatis.session.SqlSessionFactory sqlSessionFactory) {
            doSetProperty("sqlSessionFactory", sqlSessionFactory);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder healthCheckConsumerEnabled(boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
    
        
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default MybatisComponentBuilder healthCheckProducerEnabled(boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class MybatisComponentBuilderImpl
            extends AbstractComponentBuilder<MyBatisComponent>
            implements MybatisComponentBuilder {
        @Override
        protected MyBatisComponent buildConcreteComponent() {
            return new MyBatisComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configurationUri": ((MyBatisComponent) component).setConfigurationUri((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((MyBatisComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((MyBatisComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((MyBatisComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "sqlSessionFactory": ((MyBatisComponent) component).setSqlSessionFactory((org.apache.ibatis.session.SqlSessionFactory) value); return true;
            case "healthCheckConsumerEnabled": ((MyBatisComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((MyBatisComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}