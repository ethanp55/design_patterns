trait DisplayElement {
  def display(): Unit
}

case class CurrentConditionDisplay(weatherData: Subject) extends Observer with DisplayElement {
  private var temperature: Float = 0
  private var humidity: Float = 0
  weatherData.registerObserver(this)

  override def update(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.humidity = humidity
    display()
  }

  override def display(): Unit = println(s"Current conditions: $temperature F degrees and $humidity% humidity")
}