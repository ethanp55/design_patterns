trait Duck {
  var flyBehavior: FlyBehavior
  var quackBehavior: QuackBehavior

  def display(): Unit

  def performFly(): Unit = flyBehavior.fly()

  def performQuack(): Unit = quackBehavior.quack()

  def swim(): Unit = println("All ducks float, even decoys")
}

case class MallardDuck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior) extends Duck {
  def this() = this(new FlyWithWings(), new Quack())

  override def display(): Unit = println("I'm a real Mallard duck")
}

case class ModelDuck(var flyBehavior: FlyBehavior, var quackBehavior: QuackBehavior) extends Duck {
  def this() = this(new FlyNoWay(), new MuteQuack())

  override def display(): Unit = println("I'm a model duck")
}