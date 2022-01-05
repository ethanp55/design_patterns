object AdapterTest extends App {
  val wildTurkey = WildTurkey()
  val turkeyAdapter = TurkeyAdapter(wildTurkey)

  // With the adapter, you can call methods that belong to the duck interface
  turkeyAdapter.quack()
  turkeyAdapter.fly()
}