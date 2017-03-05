////////////////////////RefreeRemoteServerInterface.java begins//////////////////////////


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RefreeRemoteServerInterface extends Remote {
  public String sayHello( ) throws RemoteException;

  public void registerForCallback(String name, int choice,CallbackClientInterface callbackClientObject)
    throws RemoteException;
  public String GetWinner()  throws RemoteException ;
  
  public int NotifyMe() throws RemoteException ;
  
  public void registerForCallback2(CallbackClientInterface callbackClientObject)
		    throws RemoteException;
  
  public int GetIterations() throws RemoteException ;
  
  public void SetIterations(int n) throws RemoteException ;
}

////////////////////////RefreeRemoteServerInterface.java ends//////////////////////////
