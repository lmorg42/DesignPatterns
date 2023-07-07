package Facade;

public class Amplifier 
{

	public void on() 
	{
		System.out.println("Amplifier On");
	}

	public void setStreamingPlayer(StreamingPlayer player) 
	{
		System.out.println("Amplifier Streaming Player setting: " + player.getClass().getName());
	}

	public void setSurroundSound() 
	{
		System.out.println("Amplifier set to surround sound");
		
	}

	public void setVolume(int i) 
	{
		System.out.println("Volume set to: " + i);
	}

}
