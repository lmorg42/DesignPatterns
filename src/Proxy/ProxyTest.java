package Proxy;

import java.rmi.*;

public class ProxyTest 
{
	public static void main(String[] args) 
	{
		GumBallMachine gumballMachine = null;
		int count;
		
		if (args.length < 2) 
		{
			System.out.println("GumballMachine <name> <inventory>");
			System.exit(1);
		}
		
		try 
		{
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumBallMachine(args[0], count);
			Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
