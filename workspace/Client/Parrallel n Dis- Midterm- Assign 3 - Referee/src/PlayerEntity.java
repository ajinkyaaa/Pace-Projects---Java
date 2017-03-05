///////////////////////////PlayerEntity.java begins /////////////////////////////////
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PlayerEntity extends UnicastRemoteObject implements Remote {
protected PlayerEntity() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
public int choice;
public String name;
}
///////////////////////////PlayerEntity.java ends/////////////////////////////////////////////
