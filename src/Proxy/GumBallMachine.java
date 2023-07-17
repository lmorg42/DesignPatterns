package Proxy;

import java.rmi.*;
import java.rmi.server.*;

public class GumBallMachine extends UnicastRemoteObject implements GumBallMachineRemote
{
	private static final long serialVersionUID = 2L;
	String location;
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state = soldOutState;

	int count = 0;
	
	public GumBallMachine(String location, int numberGumballs) throws RemoteException
	{
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		winnerState = new WinnerState(this);
		this.location = location;
		
		this.count = numberGumballs;
		
		if (numberGumballs > 0) 
			state = noQuarterState;
		else 
			state = soldOutState;
	}
	
	public void insertQuarter() 
	{
		state.insertQuarter();
	}
	
	public void ejectQuarter() 
	{
		state.ejectQuarter();
	}
	
	public void turnCrank()
	{
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) 
	{
		this.state = state;
	}
	
	void releaseBall() 
	{
		System.out.println("A gumball is released");
		
		if (count > 0) 
			count = count - 1;
	}
	
	void refill(int numGumballs)
	{
		this.count += numGumballs;
		state = noQuarterState;
	}

	public State getHasQuarterState() 
	{
		return hasQuarterState;
	}

	public State getNoQuarterState() 
	{
		return noQuarterState;
	}

	public State getSoldState() 
	{
		return soldState;
	}

	public int getCount() 
	{
		return count;
	}

	public State getSoldOutState() 
	{
		return soldOutState;
	}
	
	public State getWinnerState() 
	{
		return winnerState;
	}
	
	public String getLocation() 
	{
		return location;
	}
	
	public String getState()
	{
		return state.getClass().getName();
	}
}
