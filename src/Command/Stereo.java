package Command;

public class Stereo 
{
	String stereoName;
	
	public Stereo(String name)
	{
		this.stereoName = name;
	}
	
	public void off()
	{
		System.out.println(stereoName + " Stereo is off");
	}
	
	public void on()
	{
		System.out.println(stereoName + " Stereo is on");
	}

}
