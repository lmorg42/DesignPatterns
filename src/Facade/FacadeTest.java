package Facade;

public class FacadeTest 
{

	public static void main(String[] args) 
	{
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		StreamingPlayer player = new StreamingPlayer();
		Projector projector = new Projector();
		TheaterLights lights = new TheaterLights();
		Screen screen = new Screen();
		PopcornPopper popper = new PopcornPopper();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector,
																screen, lights, popper);
		
		homeTheater.watchMovie("Up");

	}

}
