import java.util.Scanner;
import java.rmi.*;

public class CallbackClient {
  public static void main(String args[]){
    Scanner keyboard = new Scanner(System.in);
    try{
      int port = 1234;         
      String host = "localhost";
      System.out.println("Enter how many seconds to stay registered:");
      int time = keyboard.nextInt();
      String registryURL = "rmi://" + host + ":" + port + "/callback";  
      CallbackServerInterface h = (CallbackServerInterface)Naming.lookup(registryURL);
      System.out.println("Lookup completed " );
      System.out.println("Server said " + h.sayHello());
      CallbackClientInterface callbackObj = new CallbackClientImpl();
      h.registerForCallback(callbackObj);
      System.out.println("Registered for callback.");
      try{
        Thread.sleep(time * 1000);
      }catch (InterruptedException ex){
      }
      h.unregisterForCallback(callbackObj);
      System.out.println("Unregistered for callback.");
    }catch (Exception e) {
      System.out.println("Exception in CallbackClient: " + e);
    }
  }
}

