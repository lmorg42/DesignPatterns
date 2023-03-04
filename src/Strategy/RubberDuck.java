package Strategy;

public class RubberDuck extends Duck
{
	
	public RubberDuck()
	{
		this.flyBehaviour = new FlyNone();
		this.quackBehaviour = new Squeak();
	}
	
	public RubberDuck(FlyBehaviour fly, QuackBehaviour quack)
	{
		this.flyBehaviour = fly;
		this.quackBehaviour = quack;
	}

	@Override
	public void display() 
	{
		System.out.println("Rubber Duck");
	}

}
