///////////////////////////////CallbackClientInterface.java begins////////////////////////////////
import java.rmi.*;

public interface CallbackClientInterface extends Remote{
  public String notifyMe(String message) throws RemoteException;
}

///////////////////////////////CallbackClientInterface.ends ends////////////////////////////////
