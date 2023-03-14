package Observer;

public class StatisticsDisplay implements Observer, DisplayElement 
{
	private float averageTemp;
	private float totalTemp;
	private int count = 0;
	private float minTemp;
	private float maxTemp;
	private WeatherData weatherData;
	
	public StatisticsDisplay(WeatherData weatherData)
	{
		this.weatherData = weatherData;
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

	@Override
	public void display() 
	{
		System.out.printf("Avg/Max/Min Temperature: %.2f/%.2f/%.2f\n", averageTemp, maxTemp, minTemp);
	}

	@Override
	public void update() 
	{
		float temp = weatherData.getTemperature();
		if(count == 0)
		{
			this.maxTemp = temp;
			this.minTemp = temp;
		}
		else
		{
			if(temp > this.maxTemp)
				this.maxTemp = temp;
			
			if(temp < this.minTemp)
				this.minTemp = temp;
		}
		count++;
		this.totalTemp += temp;
		this.averageTemp = this.totalTemp/count;
		display();
	}

}
