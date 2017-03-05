import java.rmi.*;

public interface CallbackServerInterface extends Remote {
  public String sayHello( ) throws RemoteException;

  public void registerForCallback(CallbackClientInterface callbackClientObject)
    throws RemoteException;

  public void unregisterForCallback(CallbackClientInterface callbackClientObject)
    throws RemoteException;
}
