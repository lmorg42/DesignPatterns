package Strategy;

public abstract class Duck 
{
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	
	public Duck() {}
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehaviour.fly();
	}
	
	public void setFly(FlyBehaviour flyBehaviour)
	{
		this.flyBehaviour = flyBehaviour;
	}
	
	public void performQuack()
	{
		quackBehaviour.quack();
	}
	
	public void swim()
	{
		System.out.println("Duck is swimming");
	}

}
