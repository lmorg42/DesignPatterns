package CombinedPatterns;

//Factory Pattern to create default ducks
public class DuckFactory extends AbstractDuckFactory 
{
	public Quackable createMallardDuck() 
	{
		return new MallardDuck();
	}
	public Quackable createRedheadDuck() 
	{
		return new RedheadDuck();
	}
	public Quackable createDuckCall() 
	{
		return new Duckcall();
	}
	public Quackable createRubberDuck() 
	{
		return new RubberDuck();
	}
}
