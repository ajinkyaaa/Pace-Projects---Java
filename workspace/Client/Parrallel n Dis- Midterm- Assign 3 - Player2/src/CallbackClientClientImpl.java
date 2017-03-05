//////////////////////////////CallbackClientClientImpl.java begins /////////////////////////

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Vector;

public class CallbackClientClientImpl extends UnicastRemoteObject implements CallbackClientInterface {

	protected CallbackClientClientImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String notifyMe(String message) throws RemoteException {
	    String returnMessage = message;
	    System.out.println(returnMessage);
	    return returnMessage;
	}





}
//////////////////////////////CallbackClientClientImpl.java ends /////////////////////////

