object DuckSimulator extends App {
  val mallard: Duck = new MallardDuck()
  mallard.performQuack()
  mallard.performFly()

  val modelDuck: Duck = new ModelDuck()
  modelDuck.performQuack()
  modelDuck.performFly()
  modelDuck.flyBehavior = new FlyRocketPowered()
  modelDuck.performFly()
}