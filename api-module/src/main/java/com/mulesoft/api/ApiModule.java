/**
 * This file was automatically generated by the Mule Development Kit
 */
package com.mulesoft.api;

import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Connect;
import org.mule.api.annotations.Module;
import org.mule.api.annotations.ValidateConnection;
import org.mule.api.annotations.ConnectionIdentifier;
import org.mule.api.annotations.Disconnect;
import org.mule.api.annotations.param.ConnectionKey;
import org.mule.api.ConnectionException;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.Processor;
import org.mule.api.construct.FlowConstruct;
import org.mule.api.transport.PropertyScope;
import org.mule.construct.Flow;

import javax.inject.Inject;
import java.util.Map;

/**
 * Cloud Connector
 *
 * @author MuleSoft, Inc.
 */
@Module(name="api", schemaVersion="1.0")
public class ApiModule
{
    @Inject
    MuleContext context;
    @Processor
    @Inject
    public MuleEvent execute(String flow, Map<String, Object> properties, MuleEvent event) throws MuleException {
//        event.getMessage().getInvocationProperty();
        for(String key :  properties.keySet()){
            event.getMessage().setProperty(key, properties.get(key), PropertyScope.INBOUND);
        }
        Flow flowConstruct = (Flow) context.getRegistry().lookupFlowConstruct(flow);
        return flowConstruct.process(event);
    }

    public void setContext(MuleContext context) {
        this.context = context;
    }

    public MuleContext getContext() {
        return context;
    }

}
