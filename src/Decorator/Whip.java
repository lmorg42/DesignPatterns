package Decorator;

public class Whip extends CondimentDecorator 
{

	public Whip(Beverage beverage) 
	{
		this.beverage = beverage;
	}

	@Override
	public String getDescription() 
	{
		return beverage.getDescription() + ", Whipped Cream";
	}

	@Override
	public double cost() 
	{
		return beverage.cost() + .1;
	}

}
