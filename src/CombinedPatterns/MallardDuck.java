package CombinedPatterns;

public class MallardDuck implements Quackable 
{
	Observable observable;
	
	public MallardDuck() 
	{
		observable = new Observable(this);
	}
	
	public void registerObserver(Observer observer) 
	{
		observable.registerObserver(observer);
	}
	
	public void notifyObservers()
	{
		observable.notifyObservers();
	}
	
	public void quack() 
	{
		System.out.println("Quack");
		notifyObservers();
	}
	
	@Override
	public String toString() 
	{
		return "Mallard Duck";
	}
}
