//////////////////////////////Player1.java begins /////////////////////////////////

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Player1 {
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException, InterruptedException
	{

		int port = 16790;
		String host = "localhost";
		int noOfPlayers = 0;
		String registryURL = "rmi://" + host + ":" + port + "/RockPaperScissor";
		RefreeRemoteServerInterface rem = (RefreeRemoteServerInterface)Naming.lookup(registryURL);
		CallbackClientClientImpl remClient = new CallbackClientClientImpl();
		
		int input = 0;
		Scanner scn = new Scanner(System.in);
		int iterations = rem.GetIterations();
		
		System.out.println("-------Tournament will be of "+iterations+" Iterations.------\n");
		System.out.println("Please select one option.\n");
		System.out.println("1. Rock.");
		System.out.println("2. Paper.");      
		System.out.println("3. Scizzor.");
		
		try{
		    input = scn.nextInt();
			scn.nextLine();
			if(input>3 || input<1)
			{
				throw new Exception("Please enter integer value from options given.");
			}
			else{
				if(input == 1)
				{
					System.out.println("Player 1 has selected Rock.");
				}
				else if(input == 2)
				{
					System.out.println("Player 1 has selected Paper.");
				}
				else if(input == 3){
					System.out.println("Player 1 has selected Scizzor.");
				}
			}
			
		}
		catch(Exception ex)
		{
			System.out.println("Please enter integer value from options given.");
		}
		
		rem.registerForCallback("Player1", input,remClient);
		
	}
}
//////////////////////////////Player1.java ends ///////////////////////////////
