package Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement 
{
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
	}

	@Override
	public void display() 
	{
		System.out.println("Current Conditions: " + temperature + "C degrees and "
				+ humidity + "% humidity");
	}

	@Override
	public void update()
	{
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

	@Override
	public void register() 
	{
		weatherData.registerObserver(this);
	}

	@Override
	public void remove() 
	{
		weatherData.removeObserver(this);
	}
	
}
