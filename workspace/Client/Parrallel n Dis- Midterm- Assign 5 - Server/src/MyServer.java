import java.net.*;
import java.io.*;
import java.util.*;

public class MyServer {
  //Complete this class
  public static void main(String args[]) throws Exception {
		
	Scanner scn = new Scanner(System.in);

    ServerSocket sersock = new ServerSocket(7000);
    System.out.println("Server is ready");
    Socket sock = sersock.accept();

    PrintWriter out = new PrintWriter(sock.getOutputStream(), true);
    String message = "";
    do{
    	
    	System.out.println("Please enter blue/ green or any other word.");
    	String inputColor = scn.nextLine();
    	
    	System.out.println("Please enter a message.");
    	String inputMessage = scn.nextLine();
    	
    	message = inputColor +"-" + inputMessage;
    	out.println(message);
    	BufferedReader br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
    	message = br.readLine();
    	System.out.println("Changes have been implemented on client side!.");
    }
    while(!message.equalsIgnoreCase("bye"));
  }
}
