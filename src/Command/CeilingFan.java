package Command;

public class CeilingFan 
{
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location) 
	{
		this.location = location;
		speed = OFF;
	}
	
	public void high() 
	{
		speed = HIGH;
		output();
	}
	
	public void medium() 
	{
		speed = MEDIUM;
		output();
	}
	
	public void low() 
	{
		speed = LOW;
		output();
	}
	
	public void off() 
	{
		speed = OFF;
		output();
	}
	
	public int getSpeed() 
	{
		return speed;
	}
	
	public void output()
	{
		String fanSpeed = "";
		switch(speed)
		{
			case OFF:
				fanSpeed = "Off";
				break;
			case LOW:
				fanSpeed = "Low";
				break;
			case MEDIUM:
				fanSpeed = "Medium";
				break;
			case HIGH:
				fanSpeed = "High";
				break;
		}
		
		System.out.println(location + " Ceiling Fan is " + fanSpeed);
	}
}
