case class TurkeyAdapter(turkey: Turkey) extends Duck {
  override def quack(): Unit = turkey.gobble()

  override def fly(): Unit = {
    for(_ <- 0 until 5){
      turkey.fly()
    }
  }
}