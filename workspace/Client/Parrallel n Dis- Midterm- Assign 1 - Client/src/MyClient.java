
import java.io.*;
import java.net.*;

public class MyClient {
  public static void main(String[] args) throws IOException {
    final int MAX_LEN = 100;
    byte[] buffer = new byte[MAX_LEN];
    int port = 16790;
    DatagramPacket datagram = new DatagramPacket(buffer, buffer.length);
    DatagramSocket clientSocket = new DatagramSocket(port);
    boolean hasException = false;
    try {
    	// Socket timeout set to 5 seconds after which it throws exception if no data recieved.
      clientSocket.setSoTimeout(5000);
  	  clientSocket.receive(datagram);
    
     
      String message = new String(buffer);
      System.out.println(message);
    } 
    // Catch block to catch socket timeout exception.
    catch(SocketTimeoutException ex)
    {
    	hasException = true;
    	System.out.println("Socket exception : " + ex);
    }
    catch (IOException e) {
    	hasException = true;
      System.out.println("Error: " + e);
      System.exit(0);
    } finally {
      clientSocket.close();
    }
    
    if(!hasException)
    {
    System.out.println("The program terminated with no error and no exception");
    }
  }
}
