package Factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza 
{
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare()
	{
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		
		for (String topping : toppings) 
			System.out.println(" " + topping);
	}
	
	void bake() 
	{
		System.out.println("Baking for 25 minutes at 175");
	}
	
	void cut() 
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() 
	{
		System.out.println("Place pizza in box");
	}
	
	public String getName()
	{
		return name;
	}

}
