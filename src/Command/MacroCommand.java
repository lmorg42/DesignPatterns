package Command;

public class MacroCommand implements Command 
{
	Command[] commands;
	
	public MacroCommand(Command[] commands)
	{
		this.commands = commands;
	}

	@Override
	public void execute() 
	{
		System.out.println("\nMacro Command Executed");
		for (int i = 0; i < commands.length; i++) 
		{
			commands[i].execute();
		}
	}

	@Override
	public void undo() 
	{
		System.out.println("\nMacro Undo Executed");
		for (int i = 0; i < commands.length; i++) 
		{
			commands[i].undo();
		}
	}

}
