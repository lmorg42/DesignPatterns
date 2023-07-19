package ModelViewController;

public class DjTest 
{
	public static void main (String[] args) 
	{
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
