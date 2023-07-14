package Composite;

public class CompositeTest 
{
	public static void main(String args[]) 
	{
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);

		pancakeHouseMenu.add(new MenuItem("Pancakes", "Pancakes", true, 15));
		pancakeHouseMenu.add(dessertMenu);
		
		dinerMenu.add(new MenuItem("Pasta",
		"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
		true,
		25.89));
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("Apple Pie",
		"Apple pie with a flakey crust, topped with vanilla ice cream",
		true,
		15.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
	

}
