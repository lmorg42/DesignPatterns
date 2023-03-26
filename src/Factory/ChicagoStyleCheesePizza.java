package Factory;

public class ChicagoStyleCheesePizza extends Pizza 
{
	public ChicagoStyleCheesePizza() 
	{
		name = "Chicago Style Cheese Pizza";
		dough = "Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Mozzarella Cheese");
	}
	
	@Override
	void cut() 
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
