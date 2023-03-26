package AbstractFactory;

public abstract class PizzaStore 
{
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		System.out.print(pizza.toString());
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	abstract Pizza createPizza(String type);
}
