package Iterator;

public class IteratorTest {

	public static void main(String[] args) 
	{
		PancakeMenu pancakeMenu = new PancakeMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		Waiter waiter = new Waiter(pancakeMenu, dinerMenu, cafeMenu);
		waiter.printMenu();
	}

}
