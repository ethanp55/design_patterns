object GumballTest extends App {
  val gumballMachine: GumballMachine = GumballMachine(3)

  gumballMachine.turnCrank()
  gumballMachine.getRefund()
  gumballMachine.insertQuarter()
  gumballMachine.getRefund()
  gumballMachine.insertQuarter()
  gumballMachine.turnCrank()
  println(s"Number of remaining gumballs: ${gumballMachine.gumballCount}")
}