import java.rmi.*;
import java.rmi.server.*;
import java.util.Currency;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;


public class Project4Server{
	  public static void main(String args[]){
	    try{     
	  
	   
	      int port = 16790; 
	      String host = "localhost";
	      CalculateSumServerImpl exportedObj = new CalculateSumServerImpl();
	      LocateRegistry.createRegistry(port);
	      String registryURL = "rmi://" + host + ":" + port + "/CalculateSum";
	      Naming.rebind(registryURL, exportedObj);
	      System.out.println("Hello Server ready.");
	      
	      
	    }catch (Exception e){
	      e.printStackTrace();
	      
	    
	      
	    }
	  }
	}
