package Iterator;
import java.util.Iterator;

public class Waiter 
{
	Menu pancakeMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	public Waiter(Menu pancakeMenu, Menu dinerMenu, Menu cafeMenu) 
	{
		this.pancakeMenu = pancakeMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() 
	{
		Iterator<MenuItem> pancakeIterator = pancakeMenu.createIterator();
		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
		
		System.out.println("MENU\n----\nBREAKFAST");
		printItems(pancakeIterator);
		
		System.out.println("\nLUNCH");
		printItems(dinerIterator);
		
		System.out.println("\nDINNER");
		printItems(cafeIterator);
	}
	
	private void printItems(Iterator<MenuItem> iterator) 
	{
		while (iterator.hasNext()) 
		{
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
