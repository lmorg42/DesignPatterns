package Template;

public class Tea extends CaffieneBeverage 
{
	@Override
	void addExtras() 
	{
		System.out.println("Adding Lemon");
	}

	@Override
	void brew() 
	{
		System.out.println("Steeping the tea");
	}

}
