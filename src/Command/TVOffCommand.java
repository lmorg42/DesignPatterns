package Command;

public class TVOffCommand implements Command 
{
	Television tv;
	
	public TVOffCommand(Television tv)
	{
		this.tv = tv;
	}

	@Override
	public void execute() 
	{
		tv.off();
	}

	@Override
	public void undo() 
	{
		tv.on();
	}

}
