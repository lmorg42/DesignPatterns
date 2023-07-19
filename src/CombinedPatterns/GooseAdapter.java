package CombinedPatterns;

//Adapter Pattern for adding Geese
public class GooseAdapter implements Quackable
{
	Goose goose;
	Observable observable;

	public GooseAdapter(Goose goose) 
	{
		this.goose = goose;
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
	
	@Override
	public void quack() 
	{
		goose.honk();
		notifyObservers();
	}
	
	public String toString() 
	{
		return "Goose pretending to be a Duck";
	}
}
