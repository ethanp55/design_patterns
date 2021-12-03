trait Pizza {
  val name: String

  val dough: Dough
  val sauce: Sauce
  val veggies: Option[List[Veggie]]
  val cheese: Cheese
  val meat: Option[Meat]

  def prepare(): Unit = println(s"Preparing $name")

  def bake(): Unit = println("Bake for 25 minutes at 350")

  def cut(): Unit = println("Cutting the pizza into slices")

  def box(): Unit = println("Place pizza in box")

  override def toString(): String = s"Dough: $dough, Sauce: $sauce, Veggies: $veggies, Cheese: $cheese, Meat: $meat"
}

case class CheesePizza(ingredientFactory: PizzaIngredientFactory, name: String, dough: Dough, sauce: Sauce,
                       veggies: Option[List[Veggie]], cheese: Cheese, meat: Option[Meat]) extends Pizza {
  def this(ingredientFactory: PizzaIngredientFactory, name: String) = {
    this(ingredientFactory,name, ingredientFactory.createDough(), ingredientFactory.createSauce(), None,
      ingredientFactory.createCheese(), None)
  }
}

case class MeatPizza(ingredientFactory: PizzaIngredientFactory, name: String, dough: Dough, sauce: Sauce,
                       veggies: Option[List[Veggie]], cheese: Cheese, meat: Option[Meat]) extends Pizza {
  def this(ingredientFactory: PizzaIngredientFactory, name: String) = {
    this(ingredientFactory,name, ingredientFactory.createDough(), ingredientFactory.createSauce(), None,
      ingredientFactory.createCheese(), Some(ingredientFactory.createMeat()))
  }
}