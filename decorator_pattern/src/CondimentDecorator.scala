trait CondimentDecorator extends Beverage

case class Mocha(beverage: Beverage) extends CondimentDecorator {
  override def cost(): Double = beverage.cost() + 0.20
}

case class Soy(beverage: Beverage) extends CondimentDecorator {
  override def cost(): Double = beverage.cost() + 0.80
}

case class Whip(beverage: Beverage) extends CondimentDecorator {
  override def cost(): Double = beverage.cost() + 0.45
}