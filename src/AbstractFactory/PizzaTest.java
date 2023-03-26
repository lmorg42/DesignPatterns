package AbstractFactory;

public class PizzaTest 
{

	public static void main(String[] args) 
	{		
		orderPizza(new NYPizzaStore(), "cheese");
		orderPizza(new NYPizzaStore(), "clam");
	}
	
	public static void orderPizza(PizzaStore style, String type)
	{
		Pizza pizza = style.orderPizza(type);
		System.out.println("Customer ordered a " + pizza.getName() + "\n");
	}

}
