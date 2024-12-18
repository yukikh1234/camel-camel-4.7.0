/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ignite.idgen;

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
public class IgniteIdGenEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IgniteIdGenEndpoint target = (IgniteIdGenEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batchsize":
        case "batchSize": target.setBatchSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "initialvalue":
        case "initialValue": target.setInitialValue(property(camelContext, java.lang.Long.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, org.apache.camel.component.ignite.idgen.IgniteIdGenOperation.class, value)); return true;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": target.setPropagateIncomingBodyIfNoReturnValue(property(camelContext, boolean.class, value)); return true;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": target.setTreatCollectionsAsCacheObjects(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batchsize":
        case "batchSize": return java.lang.Integer.class;
        case "initialvalue":
        case "initialValue": return java.lang.Long.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operation": return org.apache.camel.component.ignite.idgen.IgniteIdGenOperation.class;
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return boolean.class;
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IgniteIdGenEndpoint target = (IgniteIdGenEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "batchsize":
        case "batchSize": return target.getBatchSize();
        case "initialvalue":
        case "initialValue": return target.getInitialValue();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operation": return target.getOperation();
        case "propagateincomingbodyifnoreturnvalue":
        case "propagateIncomingBodyIfNoReturnValue": return target.isPropagateIncomingBodyIfNoReturnValue();
        case "treatcollectionsascacheobjects":
        case "treatCollectionsAsCacheObjects": return target.isTreatCollectionsAsCacheObjects();
        default: return null;
        }
    }
}

