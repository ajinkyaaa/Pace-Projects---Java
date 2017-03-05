import java.rmi.Remote;
//This interface contain method calculateSum.

public interface Project4ServerInterface extends Remote {

  public int calculateSum(int n ) throws java.rmi.RemoteException;
}
