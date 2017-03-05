import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class ThreadClient extends Thread {

	public synchronized void run(){
	    try {
	    	
		        int port = 4321;
		        String host = "localhost";
		        Socket clientSocket = new Socket(host, port);
		        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		        String s = in.readLine();
		        while(s != null){
		          System.out.println(s);
		          s = in.readLine();
		        }
		        in.close();
		        clientSocket.close();
		        Thread.sleep(100);
		        
			

	      }catch (IOException e) {
	        System.out.println("Error: " + e);
	        System.exit(0);
	      } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   

	}
}
