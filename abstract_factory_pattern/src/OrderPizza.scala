object OrderPizza extends App {
  val pizzaStore: PizzaStore = NYPizzaStore()

  val cheesePizza = pizzaStore.createPizza("cheese")
  val meatPizza = pizzaStore.createPizza("meat")
  val icecreamPizza = pizzaStore.createPizza("icecream")

  println(s"Our cheese pizza looks like: ${cheesePizza.getOrElse("uh oh, they didn't have this type of pizza")}")
  println(s"Our meat pizza looks like: ${meatPizza.getOrElse("uh oh, they didn't have this type of pizza")}")
  println(s"Our icecream pizza looks like: ${icecreamPizza.getOrElse("uh oh, they didn't have this type of pizza")}")
}
