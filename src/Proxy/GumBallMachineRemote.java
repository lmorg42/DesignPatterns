package Proxy;

import java.rmi.*;

public interface GumBallMachineRemote extends Remote 
{
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public String getState() throws RemoteException;
}
