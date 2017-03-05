import java.rmi.Remote;
//This interface is contains method calculateSum.

public interface Project4ServerInterface extends Remote {

  public int calculateSum(int n ) throws java.rmi.RemoteException;
}
