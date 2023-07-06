package Command;

public class Light 
{
	String lightName;
	
	public Light(String name)
	{
		this.lightName = name;
	}
	
	public void off()
	{
		System.out.println(lightName + " Light is off");
	}
	
	public void on()
	{
		System.out.println(lightName + " Light is on");
	}

}
