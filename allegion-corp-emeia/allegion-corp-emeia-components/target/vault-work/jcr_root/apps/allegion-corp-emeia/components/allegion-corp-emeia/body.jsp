<%@include file="/apps/allegion/allegion-corp-emeia/global.jsp"%><%
%><%@page import="	com.allegion.corp.emeia.service.HelloWorldService,
					com.allegion.corp.emeia.resource.HelloWorld"%><%
%><%@page session="false" %><%

HelloWorldService helloWorldService = sling.getService(HelloWorldService.class);
HelloWorldService helloWorldService2 = resourceResolver.adaptTo(HelloWorldService.class);
HelloWorld helloWorld = currentPage.getContentResource().adaptTo(HelloWorld.class);

%>    
<body>	
	<div>
		<h1>Service from sling script helper</h1>
	    <p><%=helloWorldService.getGreetings(slingRequest.getUserPrincipal().getName())%></p>
	</div>
	<div>
		<h1>Same service from application adapter factory</h1>
	    <p><%=helloWorldService2.getGreetings(slingRequest.getUserPrincipal().getName())%></p>
	</div>
	<div>
		<h1>Current resource adapted from application adapter factory</h1>
	    <p><%=helloWorld.getTitle()%></p>
	</div>
</body>