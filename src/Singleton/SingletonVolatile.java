package Singleton;

public class SingletonVolatile 
{
	private volatile static SingletonVolatile uniqueInstance;
	private String output = "I'm a multi-thread safe and efficient singleton";
		
	private SingletonVolatile() {};
	
	public static SingletonVolatile getInstance()
	{
		if(uniqueInstance == null)
		{
			synchronized (SingletonVolatile.class) 
			{
				if(uniqueInstance == null)
					uniqueInstance = new SingletonVolatile();
			}
			
		}
		
		return uniqueInstance;
	}
	
	public void output()
	{
		System.out.println(output);
	}
	
}
