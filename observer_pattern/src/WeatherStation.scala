object WeatherStation extends App {
  val weatherData: WeatherData = WeatherData()
  val currentDisplay: CurrentConditionDisplay = CurrentConditionDisplay(weatherData)

  weatherData.setMeasurements(80, 65, 30.4f)
  weatherData.setMeasurements(82, 70, 29.2f)
  weatherData.setMeasurements(78, 90, 29.2f)
}