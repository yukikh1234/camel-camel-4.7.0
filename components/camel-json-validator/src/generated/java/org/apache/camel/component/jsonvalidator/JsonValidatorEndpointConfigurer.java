/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jsonvalidator;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointSchemaGeneratorMojo")
@SuppressWarnings("unchecked")
public class JsonValidatorEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JsonValidatorEndpoint target = (JsonValidatorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": target.setAllowContextMapAll(property(camelContext, boolean.class, value)); return true;
        case "contentcache":
        case "contentCache": target.setContentCache(property(camelContext, boolean.class, value)); return true;
        case "disableddeserializationfeatures":
        case "disabledDeserializationFeatures": target.setDisabledDeserializationFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "enableddeserializationfeatures":
        case "enabledDeserializationFeatures": target.setEnabledDeserializationFeatures(property(camelContext, java.lang.String.class, value)); return true;
        case "errorhandler":
        case "errorHandler": target.setErrorHandler(property(camelContext, org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler.class, value)); return true;
        case "failonnullbody":
        case "failOnNullBody": target.setFailOnNullBody(property(camelContext, boolean.class, value)); return true;
        case "failonnullheader":
        case "failOnNullHeader": target.setFailOnNullHeader(property(camelContext, boolean.class, value)); return true;
        case "headername":
        case "headerName": target.setHeaderName(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "urischemaloader":
        case "uriSchemaLoader": target.setUriSchemaLoader(property(camelContext, org.apache.camel.component.jsonvalidator.JsonUriSchemaLoader.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return boolean.class;
        case "contentcache":
        case "contentCache": return boolean.class;
        case "disableddeserializationfeatures":
        case "disabledDeserializationFeatures": return java.lang.String.class;
        case "enableddeserializationfeatures":
        case "enabledDeserializationFeatures": return java.lang.String.class;
        case "errorhandler":
        case "errorHandler": return org.apache.camel.component.jsonvalidator.JsonValidatorErrorHandler.class;
        case "failonnullbody":
        case "failOnNullBody": return boolean.class;
        case "failonnullheader":
        case "failOnNullHeader": return boolean.class;
        case "headername":
        case "headerName": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "urischemaloader":
        case "uriSchemaLoader": return org.apache.camel.component.jsonvalidator.JsonUriSchemaLoader.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        JsonValidatorEndpoint target = (JsonValidatorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowcontextmapall":
        case "allowContextMapAll": return target.isAllowContextMapAll();
        case "contentcache":
        case "contentCache": return target.isContentCache();
        case "disableddeserializationfeatures":
        case "disabledDeserializationFeatures": return target.getDisabledDeserializationFeatures();
        case "enableddeserializationfeatures":
        case "enabledDeserializationFeatures": return target.getEnabledDeserializationFeatures();
        case "errorhandler":
        case "errorHandler": return target.getErrorHandler();
        case "failonnullbody":
        case "failOnNullBody": return target.isFailOnNullBody();
        case "failonnullheader":
        case "failOnNullHeader": return target.isFailOnNullHeader();
        case "headername":
        case "headerName": return target.getHeaderName();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "urischemaloader":
        case "uriSchemaLoader": return target.getUriSchemaLoader();
        default: return null;
        }
    }
}

