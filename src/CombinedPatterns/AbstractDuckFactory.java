package CombinedPatterns;

//Abstract Factory Pattern to create various ducks
public abstract class AbstractDuckFactory 
{
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
