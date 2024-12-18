/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.optaplanner;

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
public class OptaPlannerEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        OptaPlannerEndpoint target = (OptaPlannerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": target.getConfiguration().setAsync(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configfile":
        case "configFile": target.getConfiguration().setConfigFile(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "problemid":
        case "problemId": target.getConfiguration().setProblemId(property(camelContext, java.lang.Long.class, value)); return true;
        case "solverid":
        case "solverId": target.getConfiguration().setSolverId(property(camelContext, java.lang.String.class, value)); return true;
        case "solvermanager":
        case "solverManager": target.getConfiguration().setSolverManager(property(camelContext, org.optaplanner.core.api.solver.SolverManager.class, value)); return true;
        case "threadpoolsize":
        case "threadPoolSize": target.getConfiguration().setThreadPoolSize(property(camelContext, int.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configfile":
        case "configFile": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "problemid":
        case "problemId": return java.lang.Long.class;
        case "solverid":
        case "solverId": return java.lang.String.class;
        case "solvermanager":
        case "solverManager": return org.optaplanner.core.api.solver.SolverManager.class;
        case "threadpoolsize":
        case "threadPoolSize": return int.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        OptaPlannerEndpoint target = (OptaPlannerEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "async": return target.getConfiguration().isAsync();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configfile":
        case "configFile": return target.getConfiguration().getConfigFile();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "problemid":
        case "problemId": return target.getConfiguration().getProblemId();
        case "solverid":
        case "solverId": return target.getConfiguration().getSolverId();
        case "solvermanager":
        case "solverManager": return target.getConfiguration().getSolverManager();
        case "threadpoolsize":
        case "threadPoolSize": return target.getConfiguration().getThreadPoolSize();
        default: return null;
        }
    }
}

