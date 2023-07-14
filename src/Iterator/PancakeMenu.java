package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PancakeMenu implements Menu
{
	List<MenuItem> menuItems;
	
	public PancakeMenu() 
	{
		menuItems = new ArrayList<MenuItem>();
		addItem("Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 8.99);
		addItem("Regular Pancakes", "Pancakes with fried eggs, sausage", false, 9.50);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 12.50);
		addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 10.00);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator<MenuItem> createIterator()
	{
		return menuItems.iterator();
	}
}
