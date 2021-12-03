trait PizzaIngredientFactory {
  def createDough(): Dough

  def createSauce(): Sauce

  def createCheese(): Cheese

  def createVeggies(): List[Veggie]

  def createMeat(): Meat
}

case class NYPizzaIngredientFactory() extends PizzaIngredientFactory {
  override def createDough(): Dough = ThinCrustDough()

  override def createSauce(): Sauce = MarinaraSauce()

  override def createCheese(): Cheese = ReggianoCheese()

  override def createVeggies(): List[Veggie] = List(Garlic(), Onion(), RedPepper())

  override def createMeat(): Meat = Pepperoni()
}