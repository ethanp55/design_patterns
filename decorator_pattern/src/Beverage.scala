trait Beverage {
  def cost(): Double
}

case class Espresso() extends Beverage {
  override def cost(): Double = 1.99
}

case class HouseBlend() extends Beverage {
  override def cost(): Double = 0.89
}