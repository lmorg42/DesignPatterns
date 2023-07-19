package CombinedPatterns;

public class Duckcall implements Quackable 
{
	Observable observable;
	
	public Duckcall() 
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
		System.out.println("Kwak");
		notifyObservers();
	}
	
	public String toString() 
	{
		return "Duck Call";
	}
}