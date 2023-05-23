package Singleton;

public class SingletonClient 
{
	public enum SingletonEnum
	{
		UNIQUE_INSTANCE;
		
		private String output = "I'm a unique enum instance";
		
		public void output()
		{
			System.out.println(output);
		}
	}

	public static void main(String[] args) 
	{
		SingletonEnum.UNIQUE_INSTANCE.output();
		Singleton.getInstance().output();
		SingletonVolatile.getInstance().output();
	}

}
