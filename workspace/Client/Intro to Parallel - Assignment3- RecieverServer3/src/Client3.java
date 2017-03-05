import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner; 

public class Client3{
  public static void main(String[] args){
    try{      
    Scanner scn = new Scanner(System.in);
    	
	InetAddress group = InetAddress.getByName("239.1.22.3");
	MulticastSocket s = new MulticastSocket(3456);
	
	String msg = "";
	byte[] buf = new byte[1000];
	
		
	System.out.println("Enter a Integer to send to Server, enter 0 for Summation...");
	msg = scn.nextLine();
	
	s.send(new DatagramPacket(msg.getBytes(),msg.length(),group,3456));
	
	System.out.println("Integer sent to the server.");

	s.close();
    }
    catch (Exception ex){
	ex.printStackTrace( ); 		
    }
  }
}
