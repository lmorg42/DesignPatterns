package Proxy;

public class SoldOutState implements State 
{
	private static final long serialVersionUID = 2L;
	transient GumBallMachine gumballMachine;
	
	public SoldOutState(GumBallMachine gumballMachine) 
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() 
	{
		System.out.println("You can't insert quarter");
	}

	@Override
	public void ejectQuarter() 
	{
		System.out.println("Nothing Happens");
	}

	@Override
	public void turnCrank() 
	{
		System.out.println("Nothing Happens");
	}

	@Override
	public void dispense()
	{
		System.out.println("Nothing Happens");
	}

}
