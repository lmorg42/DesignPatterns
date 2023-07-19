package CombinedPatterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Composite pattern to compose ducks as a group of objects
public class Flock implements Quackable 
{
	List<Quackable> ducks = new ArrayList<Quackable>();
	Observable observable;
	
	public void add(Quackable quacker) 
	{
		ducks.add(quacker);
		observable = new Observable(this);
	}
	
	public void quack() 
	{
		//Iterator Pattern to go through list of ducks
		Iterator<Quackable> iterator = ducks.iterator();
		
		while (iterator.hasNext()) 
		{
			Quackable duck = iterator.next();
			duck.quack();
		}
	}
	
	public void registerObserver(Observer observer) 
	{
		Iterator<Quackable> iterator = ducks.iterator();
		
		while (iterator.hasNext()) 
		{
			Quackable duck = (Quackable)iterator.next();
			duck.registerObserver(observer);
		}
	}
	
	public void notifyObservers() {}
	
	public String toString() 
	{
		return "Flock of Ducks";
	}
}
