package Strategy;

import java.util.ArrayList;

public class Main 
{

	public static void main(String[] args) 
	{
		ArrayList<Duck> ducks = new ArrayList<>();
		
		ducks.add(new MallardDuck(new FlyWithWings(), new Quack()));
		ducks.add(new MallardDuck());
		ducks.add(new RubberDuck());
		
		for (Duck duck : ducks)
			testDuck(duck);
		
		ducks.get(0).setFly(new FlyNone());
		testDuck(ducks.get(0));
	}
	
	public static void testDuck(Duck duck)
	{
		duck.display();
		duck.performQuack();
		duck.performFly();
		duck.swim();
		System.out.println();
	}

}
