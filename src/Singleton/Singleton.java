package Singleton;

public class Singleton 
{
	private static Singleton uniqueInstance;
	private String output = "I'm a multi-thread safe singleton";
	
	private Singleton() {};
	
	public static synchronized Singleton getInstance()
	{
		if(uniqueInstance == null)
			uniqueInstance = new Singleton();
		
		return uniqueInstance;
	}
	
	public void output()
	{
		System.out.println(output);
	}

}
