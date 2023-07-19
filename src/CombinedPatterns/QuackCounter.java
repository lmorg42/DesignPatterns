package CombinedPatterns;

//Decorator Pattern used to implement count behavior
public class QuackCounter implements Quackable
{
	Quackable duck;
	Observable observable;
	//Static variable to count all duck objects created
	static int numberOfQuacks;
	
	public QuackCounter (Quackable duck) 
	{
		this.duck = duck;
		observable = new Observable(this);
	}
	
	public void quack() 
	{
		duck.quack();
		notifyObservers();
		numberOfQuacks++;
	}
	
	public static int getQuacks() 
	{
		return numberOfQuacks;
	}
	
	public void registerObserver(Observer observer) 
	{
		observable.registerObserver(observer);
	}
	
	public void notifyObservers()
	{
		observable.notifyObservers();
	}
	
	public String toString() 
	{
		return duck.toString();
	}
}
