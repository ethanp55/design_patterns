trait PizzaStore {
  def createPizza(pizzaType: String): Option[Pizza]
}

case class NYPizzaStore() extends PizzaStore {
  val pizzaIngredientFactory: PizzaIngredientFactory = NYPizzaIngredientFactory()

  override def createPizza(pizzaType: String): Option[Pizza] = {
    pizzaType match {
      case "cheese" => Some(new CheesePizza(pizzaIngredientFactory, "NY Cheese Pizza"))

      case "meat" => Some(new MeatPizza(pizzaIngredientFactory, "NY Meat Pizza"))

      case _ =>
        println(s"Sorry, but we don't serve $pizzaType pizza")
        None
    }
  }
}