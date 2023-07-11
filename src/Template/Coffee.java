package Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffieneBeverage
{
	@Override
	void addExtras()
	{
		System.out.println("Adding Sugar and Milk");
	}

	@Override
	void brew() 
	{
		System.out.println("Dripping Coffee through filter");
	}
	
	@Override
	public boolean customerWantsExtra() 
	{
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) 
			return true;
		else
			return false;
	}
	
	private String getUserInput() 
	{
		String answer = null;
		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try 
		{
			answer = in.readLine();
		} 
		catch (IOException ioe) 
		{
			System.err.println("IO error trying to read your answer");
		}
		
		if (answer == null) 
			return "no";
		return answer;
	}

}
