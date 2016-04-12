package CXF;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.ws.Endpoint;
	
	public class Server {
	
	    protected Server() throws Exception {
	        // START SNIPPET: publish
	        System.out.println("Starting Server");
	        HelloWorldImpl implementor = new HelloWorldImpl();
	        String address = "http://localhost:9000/helloWorld";
	        
	        Endpoint endpoint = Endpoint.publish(address, implementor);
	        ExecutorService es = Executors.newFixedThreadPool(4);
	        endpoint.setExecutor(es);
	        // END SNIPPET: publish
	    }
	
	    public static void main(String args[]) throws Exception {
	        new Server();
	        System.out.println("Server ready...");
	
	        Thread.sleep(5 * 60 * 1000);
	        System.out.println("Server exiting");
	        System.exit(0);
	    }
	}