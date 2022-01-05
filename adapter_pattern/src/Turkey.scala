trait Turkey {
  def gobble(): Unit

  def fly(): Unit
}

case class WildTurkey() extends Turkey {
  override def gobble(): Unit = println("Gobble gobble")

  override def fly(): Unit = println("I'm flying a short distance")
}