package CXF;

import java.util.LinkedHashMap;
import java.util.Map;
	
import javax.jws.WebService;
	
	@WebService(endpointInterface = "CXF.HelloWorld",
	            serviceName = "HelloWorld")
	public class HelloWorldImpl implements HelloWorld {
	
	
	    public String sayHi(String text) {
	        System.out.println("sayHi called");
	        return "Hello " + text;
	    }
	
	   
	
	   
	
	}