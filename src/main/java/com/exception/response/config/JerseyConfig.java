package com.exception.response.config;

import com.exception.response.exception.handler.ExceptionHandler;
import com.exception.response.exception.handler.ExceptionHandler1;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * registering with jersey via packages and class names
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        packages("com.exception.response");
//        register(ExceptionHandler.class);
//        register(ExceptionHandler1.class);
        registerClasses(ExceptionHandler.class,
                ExceptionHandler1.class);
    }
}
