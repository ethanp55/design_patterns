trait Subject {
  def registerObserver(observer: Observer): Unit

  def removeObserver(observer: Observer): Unit

  def notifyObservers(): Unit
}

case class WeatherData() extends Subject {
  private var observers: List[Observer] = List.empty
  private var temperature: Float = 0
  private var humidity: Float = 0
  private var pressure: Float = 0

  override def registerObserver(observer: Observer): Unit = observers :+= observer

  override def removeObserver(observer: Observer): Unit = observers = observers.filterNot(o => o == observer)

  override def notifyObservers(): Unit = {
    observers.foreach { observer =>
      observer.update(temperature, humidity, pressure)
    }
  }

  def setMeasurements(temparture: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temparture
    this.humidity = humidity
    this.pressure = pressure

    notifyObservers()
  }
}