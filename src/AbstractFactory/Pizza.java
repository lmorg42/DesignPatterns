package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza 
{
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
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
	
	void setName(String name) 
	{
		this.name = name;
	}
	
	public String toString() 
	{
		StringBuilder output = new StringBuilder();
		if(dough != null)
			output.append("Tossing " + dough.toString() + "...\n");
		if(cheese != null)
			output.append("Adding " + cheese.toString() + "...\n");
		if(clam != null)
			output.append("Adding " + clam.toString() + "...\n");
		return output.toString();
	}

}
