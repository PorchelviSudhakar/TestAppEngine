package com.test.first;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;


public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
    	System.out.println("Came into Application Config");
        // this call has the same effect as
        // jersey.config.server.provider.packages
        // in the web.xml: it scans that packages for resources and providers. 
        packages("com.test.first");
    }
}
