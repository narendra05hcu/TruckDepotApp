package com.truckdepot.service.impl.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

import com.truckdepot.service.impl.SearchServiceImpl;

public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
    	 property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
    	 property(ServerProperties.BV_DISABLE_VALIDATE_ON_EXECUTABLE_OVERRIDE_CHECK, true);
    	 property(ServerProperties.RESPONSE_SET_STATUS_OVER_SEND_ERROR, true);
        // Enable Spring DI and Jackson configuration
        register(RequestContextFilter.class);
        register(JacksonObjectMapperConfig.class);
        register(ValidationConfigurationContextResolver.class);
        //service classe
        register(SearchServiceImpl.class);
        
    }
}
