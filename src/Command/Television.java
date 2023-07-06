package Command;

public class Television 
{
	String tvName;
	
	public Television(String name)
	{
		this.tvName = name;
	}
	
	public void off()
	{
		System.out.println(tvName + " TV is off");
	}
	
	public void on()
	{
		System.out.println(tvName + " TV is on");
	}

}
