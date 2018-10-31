package com.vical.config;

import com.vical.rest.GreetingRest;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * @author vical on 25-07-17.
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(GreetingRest.class);
    }
}
