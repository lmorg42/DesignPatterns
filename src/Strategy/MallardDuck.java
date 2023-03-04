package Strategy;

public class MallardDuck extends Duck 
{
	
	public MallardDuck()
	{
		this.flyBehaviour = new FlyWithWings();
		this.quackBehaviour = new Quack();
	}
	
	public MallardDuck(FlyBehaviour fly, QuackBehaviour quack)
	{
		this.flyBehaviour = fly;
		this.quackBehaviour = quack;
	}

	@Override
	public void display() 
	{
		System.out.println("Mallard Duck");
	}
	
}
