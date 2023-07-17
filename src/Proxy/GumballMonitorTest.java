package Proxy;

import java.rmi.*;
public class GumballMonitorTest
{
	public static void main(String[] args) 
	{
		String[] location = 
		{
			"rmi://localhost/gumballmachine",
		};
		
		GumballMonitor[] monitor = new GumballMonitor[location.length];
		
		for (int i=0; i < location.length; i++) 
		{
			try 
			{
				GumBallMachineRemote machine = (GumBallMachineRemote) Naming.lookup(location[i]);
				monitor[i] = new GumballMonitor(machine);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		
		for (int i=0; i < monitor.length; i++) 
		{
			monitor[i].report();
		}
	}
}
