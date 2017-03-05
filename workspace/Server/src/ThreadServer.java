import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadServer extends Thread{

	public void run()
	{
		synchronized (new ThreadServer()) {
			Scanner keyboard = new Scanner(System.in);
		
			try {
			      int port = 4321;
			      ServerSocket serverSocket = new ServerSocket(port);
			      Socket clientSocket = serverSocket.accept();
			      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			      String message = "";
			    //  do{
			        System.out.print("Bob: ");
			        message = keyboard.nextLine();
			        out.println(message);
			        Thread.sleep(100);
			  //    }while(!message.equalsIgnoreCase("end"));
			      out.close();
			      clientSocket.close();
			      serverSocket.close();
			      
			     
			    } catch (IOException e) {
			        System.out.println("Error: " + e);
			    } catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	};
}
