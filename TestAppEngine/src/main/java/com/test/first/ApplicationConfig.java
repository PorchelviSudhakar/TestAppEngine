package com.test.first;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

/* This Class is used to create singleton Object and configurations can be done in this class like component scan in spring */
public class ApplicationConfig extends ResourceConfig {
	public ApplicationConfig() {
		System.out.println("Calling Application Config");
		register(StudentResources.class);
		register(new AbstractBinder() {
			@Override
			protected void configure() {
				bind(new StudentRepository()).to(StudentRepository.class);
			}
		});
	}
}
