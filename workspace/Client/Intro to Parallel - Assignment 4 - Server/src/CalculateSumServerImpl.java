//Server class implementing Interface and extending class //UnicastRemoteObject


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class CalculateSumServerImpl extends UnicastRemoteObject implements Project4ServerInterface {

	protected CalculateSumServerImpl() throws RemoteException {
		super();
		
	}

	@Override
	public int calculateSum(int n) throws RemoteException {
		
		int Result = 0;
		for(int i = n; i >= 1;i--)
		{
			Result = Result + i;
		}
		return Result;
	}
 }
