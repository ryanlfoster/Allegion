package com.allegion.corp.emeia.impl.service;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import com.allegion.corp.emeia.service.HelloWorldService;
import com.allegion.corp.emeia.impl.service.HelloWorldServiceImpl;

public class HelloWorldServiceImplTestCase 
{

	private static HelloWorldService helloWorldService;
 	
	@BeforeClass
	public static void setUpClass()
	{
		helloWorldService = new HelloWorldServiceImpl();
	}
	
	@Test
	public void testGestServiceNames() throws java.lang.Exception 
	{
		Assert.assertEquals(helloWorldService.getGreetings("test"), "Hello test");
	}
}
