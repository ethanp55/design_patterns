trait CaffeineBeverage {
  def prepareBeverage(condiments: List[String]): Unit = {
    boilWater()
    brew()
    pourInCup()
    addCondiments(condiments)
  }

  // These 2 methods are pretty much the same for any hot caffeine beverage, so
  // we provide the implementation here
  def boilWater(): Unit = println("Boiling water...")

  def pourInCup(): Unit = println("Pouring beverage into cup")

  // These 2 methods might vary depending on the beverage, so subclasses should provide
  // the implementation
  def brew(): Unit

  def addCondiments(condiments: List[String]): Unit
}