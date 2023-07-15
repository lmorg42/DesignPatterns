package State;

public class SoldOutState implements State 
{
	GumBallMachine gumballMachine;
	
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
