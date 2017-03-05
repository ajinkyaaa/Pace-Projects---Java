/////////////////////////////Refree.java begins //////////////////////////////////////////////
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

public class Refree {
	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException
	{
		
	    try{     
	    	int input = 0;
	    	System.out.println("Set number of Iterations.");
	    	Scanner scn = new Scanner(System.in);
			try{
		
	        input = scn.nextInt();
	    	scn.nextLine();
			}
			catch(Exception ex)
			{
				System.out.println("Please enter integers only.");
				main(args);
			}
	        int port = 16790;
	        String host = "localhost";
	        LocateRegistry.createRegistry (port);
	        PlayerEntity obj = new PlayerEntity();
	        RefreeRemoteServerInterfaceImpl exportedObj = new RefreeRemoteServerInterfaceImpl(obj);
	        exportedObj.SetIterations(input);
	        String registryURL = "rmi://" + host + ":" + port + "/RockPaperScissor";
	        Naming.rebind(registryURL, exportedObj);
	        System.out.println("Refree ready to make Decisions, Please start the game.");
	      }
	      catch (Exception re){
	        System.out.println("Exception in HelloServer.main: " + re);
	      }
	}
}
///////////////////////////Refree.java ends //////////////////////////////////////////////////////
