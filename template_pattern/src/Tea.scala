case class Tea() extends CaffeineBeverage {
  override def brew(): Unit = println("Brewing tea leaves")

  override def addCondiments(condiments: List[String]): Unit = {
    condiments.foreach(condiment => println(s"Adding $condiment to tea"))
  }
}