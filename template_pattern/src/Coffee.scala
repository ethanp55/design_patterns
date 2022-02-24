case class Coffee() extends CaffeineBeverage {
  override def brew(): Unit = println("Brewing coffee beans")

  override def addCondiments(condiments: List[String]): Unit = {
    condiments.foreach(condiment => println(s"Adding $condiment to coffee"))
  }
}