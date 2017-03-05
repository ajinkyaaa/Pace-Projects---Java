import java.io.*;
import java.net.ConnectException;
import java.net.Socket;

public class MyClient {
  public static void main(String[] args) throws IOException {
    Socket clientSocket = null;
    BufferedReader in = null;
    System.out.println("Welcome to the Daytime client.");
    try {
    	boolean isServerConnected = false;
    	
    	// While loop till server is connected.
    	while(!isServerConnected)
    	{
	    	try
	    	{
	    		clientSocket = new Socket("localhost", 4321);
	    		isServerConnected = true;
	    	}
	    	// Connection refused i.e server not connected exception caught.
	    	catch(ConnectException ex)
	    	{
	    		// Exception caught which can be printed by uncommenting below line.
	    	   //System.out.println("Wait method interrupted becaus of "+ex);
		 	}
    	}
      in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      String s = in.readLine();
      System.out.println("Here is the timestamp received from the server: "+s);
      in.close();
      clientSocket.close();      
      clientSocket.close();
    }catch (IOException e) {
      System.out.println("Error: " + e);
      System.exit(0);
    }
    System.out.println("The program terminated with no error and no exception");
  }
}
