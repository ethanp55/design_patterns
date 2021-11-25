trait Observer {
  def update(temperature: Float, humidity: Float, pressure: Float): Unit
}