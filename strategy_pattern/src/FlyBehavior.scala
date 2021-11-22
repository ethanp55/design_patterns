trait FlyBehavior {
  def fly(): Unit
}

class FlyWithWings() extends FlyBehavior {
  def fly(): Unit = println("I'm flying")
}

class FlyNoWay() extends FlyBehavior {
  def fly(): Unit = println("I can't fly")
}

class FlyRocketPowered() extends FlyBehavior {
  def fly(): Unit = println("I'm flying with a rocket")
}
