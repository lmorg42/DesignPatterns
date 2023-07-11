package Template;

public abstract class CaffieneBeverage 
{
	final void prepareRecipe()
	{
		boilWater();
		brew();
		pourInCup();
		if(customerWantsExtra())
			addExtras();
	}

	abstract void addExtras();

	abstract void brew();

	void boilWater() 
	{
		System.out.println("Boiling water");
	}
	
	void pourInCup()
	{
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsExtra()
	{
		return true;
	}
}
