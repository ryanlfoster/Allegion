package com.allegion.corp.emeia.impl.service;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.Constants;

import com.allegion.corp.emeia.service.HelloWorldService;

/**
 * Demo OSGI service impl for allegion-corp-emeia Project
 * 
 * @author valtech
 */
@Component(
		name = "com.allegion.corp.emeia.service.HelloWorldService",
		immediate = true,
		metatype = true,
		label = "allegion-corp-emeia Project Hello World Service", 
		description = "Demo OSGI service impl for allegion-corp-emeia")
@Service
@Properties( {
    @Property(name = Constants.SERVICE_DESCRIPTION, value = "allegion-corp-emeia Project Hello World Service"),
    @Property(name = Constants.SERVICE_VENDOR, value = "Valtech S.A.")
})
public class HelloWorldServiceImpl implements HelloWorldService
{
	@Override
	public String getGreetings(String username)
	{
		return "Hello "+username;
	}

}