import java.io.*;
import java.net.*;
import java.util.*;

public class MyServerChat {
  public static void main(String[] args) throws IOException {
	//Scanner to get inputs
	  Scanner keyboard = new Scanner(System.in);
    try {
      int port = 16790;
      //Server socket created on vulcan.seidenberg.pace.edu
      ServerSocket serverSocket = new ServerSocket(port);
      
      Socket clientSocket = serverSocket.accept();
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      String message = "Hello!";
      
      do{
    	  //Send the first Hello message and consecutive messages to Client.
    	  out.println(message);   
           
        //Get the input message from Client              	
       BufferedReader in = new BufferedReader(
     		  new InputStreamReader(clientSocket.getInputStream()));
       
       message = in.readLine();
       System.out.print("Client: "+message +"\n");
       System.out.println("Enter a line for the server: ");
       
       message =  keyboard.nextLine();
      }      
      while(!message.replace("Client: ", "").equalsIgnoreCase("bye"));
      System.out.print("Client entered bye , hence closing the chat session!");
      out.close();
      clientSocket.close();
      serverSocket.close();
    } catch (IOException e) {
        System.out.println("Error: " + e);
    }
  }
}
