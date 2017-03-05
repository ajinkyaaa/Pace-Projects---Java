////////////////////////// RefreeRemoteServerInterfaceImpl .java begins////////////////////////////////////
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class RefreeRemoteServerInterfaceImpl extends UnicastRemoteObject implements RefreeRemoteServerInterface
{

	private int noOfIterations;
	private Vector<PlayerEntity> clientList;
	private Vector clientInterfaceList;
	private int counter = 0;
	List<String> list = new ArrayList<String>();
	protected RefreeRemoteServerInterfaceImpl(PlayerEntity obj) throws RemoteException {
		super();
		clientList = new Vector();
		clientInterfaceList = new Vector();		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void registerForCallback(String name, int choice,CallbackClientInterface callbackClientObject) throws RemoteException {
	
		clientInterfaceList.addElement(callbackClientObject);
				PlayerEntity entity = new PlayerEntity();
				entity.name = name;
				entity.choice = choice;
		        clientList.addElement(entity);
		        System.out.println(entity.name+" has selected an option, waiting for other player... ");
		       
		        if(clientInterfaceList.size() == 2)
		        {
		        	
		        	String winner = GetWinner();
		        	clientList = new Vector();
		        for (int i = 0; i < clientInterfaceList.size(); i++){
		                
		            CallbackClientInterface nextClient = (CallbackClientInterface)clientInterfaceList.elementAt(i);
		            nextClient.notifyMe(winner);
		            
		            if(counter == noOfIterations)
		            {
		            	if(Collections.frequency(list, "Player1")> Collections.frequency(list, "Player2"))
		            	{
		            		nextClient.notifyMe("x-------------Tournament over!!! Player 1 wins!!!--------------x");
		            	}
		            	else if(Collections.frequency(list, "Player2")> Collections.frequency(list, "Player1")){
		            		nextClient.notifyMe("x-------------Tournament over!!! Player 2 wins!!!--------------x");
		            	}
		            	else{
		            		nextClient.notifyMe("x-------------Tournament is tie between Player 1 and Player 2!!!--------------x");	
		            	}
		            	((CallbackClientInterface) clientInterfaceList.elementAt(i)).notifyMe("Player 1 won "+Collections.frequency(list, "Player1")+" games, Player 2 won "+Collections.frequency(list, "Player2")+" games and "+Collections.frequency(list, "Draw")+" were Draws!" );
		            	
		            }
		            
		          }
		        clientInterfaceList = new Vector();	
		        }
		
	}
	public String GetWinner() throws RemoteException  {
		// TODO Auto-generated method stub
		//int a = clientList.size();
		counter += 1;
		
		PlayerEntity player1 =  clientList.elementAt(0);
		PlayerEntity player2 =  clientList.elementAt(1);
		
		if(player1.choice == 1 && player2.choice == 3){
			
			list.add(player1.name);
			return player1.name + " Wins!";
			
		}
		else if(player2.choice == 1 && player1.choice == 3)
		{
			list.add(player2.name);
			return player2.name + " Wins!";
		}
		else if((player1.choice < player2.choice))
		{
			list.add(player2.name);
			return player2.name + " Wins!";
			
		}
		
		else if((player1.choice > player2.choice))
		{
			list.add(player1.name);
			return player1.name + " Wins!";
		}
		
		else if(player1.choice == player2.choice){
			list.add("Draw");
			return "Its a Draw!";
		}
		else{
			return "Unable to decide. Sorry.";
		}
		
		
		
	}

	@Override
	public int NotifyMe() throws RemoteException {
		// TODO Auto-generated method stub
		return clientList.size();
	}

	@Override
	public void registerForCallback2(CallbackClientInterface callbackClientObject) throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int GetIterations() throws RemoteException {
		
		
		return noOfIterations;
	}


	@Override
	public void SetIterations(int n) throws RemoteException {
		// TODO Auto-generated method stub
		noOfIterations = n;
	}
	
	
	






	
}

///////////////////////////////RefreeRemoteServerInterfaceImpl.java ends //////////////////////////////////
