import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;

public class CallbackServer{
  public static void main(String args[]){
    try{     
      int port = 1234;
      String host = "localhost";
      LocateRegistry.createRegistry (port);
      CallbackServerImpl exportedObj = new CallbackServerImpl();
      String registryURL = "rmi://" + host + ":" + port + "/callback";
      Naming.rebind(registryURL, exportedObj);
      System.out.println("Callback Server ready.");
    }
    catch (Exception re){
      System.out.println("Exception in HelloServer.main: " + re);
    }
  }
}

