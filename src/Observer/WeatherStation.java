package Observer;
public class WeatherStation {

	public static void main(String[] args) 
	{
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statsDisplay = new StatisticsDisplay(weatherData);
		
		currentDisplay.register();
		statsDisplay.register();
		
		weatherData.setMeasurements(30, 65, 30.4f);
		weatherData.setMeasurements(31, 70, 29.2f);
		currentDisplay.remove();
		
		weatherData.setMeasurements(29, 65, 30.6f);

	}

}
