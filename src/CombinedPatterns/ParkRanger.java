package CombinedPatterns;

public class ParkRanger implements Observer 
{
	public void update(QuackObservable duck) 
	{
		System.out.println("Park Ranger: " + duck.toString() + " just quacked.");
	}
}
