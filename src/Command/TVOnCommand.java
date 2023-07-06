package Command;

public class TVOnCommand implements Command 
{
	Television tv;
	
	public TVOnCommand(Television tv)
	{
		this.tv = tv;
	}

	@Override
	public void execute() 
	{
		tv.on();
	}

	@Override
	public void undo() 
	{
		tv.off();
	}

}
