package com.allegion.corp.emeia.impl.servlet;

import java.io.IOException;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.commons.json.io.JSONWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.allegion.corp.emeia.service.HelloWorldService;


/**
 * Demo servlet for allegion-corp-emeia
 * 
 * @author valtech
 */
@SlingServlet(
		methods="GET",
		resourceTypes="allegion/allegion-corp-emeia/components/allegion-corp-emeia",
		extensions="json"
)
public class HelloWorldServlet extends SlingSafeMethodsServlet 
{
	private static final long serialVersionUID = 1L;
	
	private static Logger log = LoggerFactory.getLogger(HelloWorldServlet.class);
	
	@Reference
	private HelloWorldService helloWorldService;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException
	{		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		try 
		{
			JSONWriter writer = new JSONWriter(response.getWriter());
			writer.object();
			writer.key("message").value(helloWorldService.getGreetings(request.getUserPrincipal().getName()));
			writer.endObject();
		}
		catch (Exception e) 
		{
			log.error("An error occured", e);
			response.sendError(500, e.getMessage());
		}
	}

}