trait QuackBehavior {
  def quack(): Unit
}

class Quack() extends QuackBehavior {
  override def quack(): Unit = println("Quack")
}

class MuteQuack() extends QuackBehavior {
  override def quack(): Unit = println("<< Silence >>")
}
