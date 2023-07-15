package State;

public class NoQuarterState implements State 
{
	GumBallMachine gumballMachine;
	
	public NoQuarterState(GumBallMachine gumballMachine) 
	{
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() 
	{
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() 
	{
		System.out.println("You haven't inserted a quarter");
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
