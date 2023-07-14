package Iterator;
import java.util.Iterator;

public class DinerMenu implements Menu
{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() 
	{
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian Sandwich", "Lettuce & tomato on whole wheat", true, 9.00);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 13.50);
		addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 10.00);
		addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 9.00);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) 
			System.err.println("Sorry, menu is full! Can't add item to menu");
		else 
		{
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public Iterator<MenuItem> createIterator()
	{
		return new DinerMenuIterator(menuItems);
	}

}
