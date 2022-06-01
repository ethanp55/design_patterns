case class GumballMachine(initialCount: Int) {
  var currState: State = NoQuarterState(this)
  var gumballCount: Int = initialCount

  if (initialCount < 0) {
    currState = SoldOutState(this)
  }

  def setState(state: State): Unit = currState = state

  def releaseGumball(): Unit = {
    println("Congratulations, you get a gumball")
    gumballCount -= 1
  }

  def insertQuarter(): Unit = currState.insertQuarter()

  def getRefund(): Unit = currState.getRefund()

  def turnCrank(): Unit = {
    currState.turnCrank()
    currState.dispense()
  }
}