/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dynamicrouter.control;

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
public class DynamicRouterControlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DynamicRouterControlEndpoint target = (DynamicRouterControlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "destinationuri":
        case "destinationUri": target.getConfiguration().setDestinationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "expressionlanguage":
        case "expressionLanguage": target.getConfiguration().setExpressionLanguage(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "predicate": target.getConfiguration().setPredicate(property(camelContext, java.lang.String.class, value)); return true;
        case "predicatebean":
        case "predicateBean": target.getConfiguration().setPredicateBean(property(camelContext, org.apache.camel.Predicate.class, value)); return true;
        case "priority": target.getConfiguration().setPriority(property(camelContext, java.lang.Integer.class, value)); return true;
        case "subscribechannel":
        case "subscribeChannel": target.getConfiguration().setSubscribeChannel(property(camelContext, java.lang.String.class, value)); return true;
        case "subscriptionid":
        case "subscriptionId": target.getConfiguration().setSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "destinationuri":
        case "destinationUri": return java.lang.String.class;
        case "expressionlanguage":
        case "expressionLanguage": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "predicate": return java.lang.String.class;
        case "predicatebean":
        case "predicateBean": return org.apache.camel.Predicate.class;
        case "priority": return java.lang.Integer.class;
        case "subscribechannel":
        case "subscribeChannel": return java.lang.String.class;
        case "subscriptionid":
        case "subscriptionId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DynamicRouterControlEndpoint target = (DynamicRouterControlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "destinationuri":
        case "destinationUri": return target.getConfiguration().getDestinationUri();
        case "expressionlanguage":
        case "expressionLanguage": return target.getConfiguration().getExpressionLanguage();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "predicate": return target.getConfiguration().getPredicate();
        case "predicatebean":
        case "predicateBean": return target.getConfiguration().getPredicateBean();
        case "priority": return target.getConfiguration().getPriority();
        case "subscribechannel":
        case "subscribeChannel": return target.getConfiguration().getSubscribeChannel();
        case "subscriptionid":
        case "subscriptionId": return target.getConfiguration().getSubscriptionId();
        default: return null;
        }
    }
}

