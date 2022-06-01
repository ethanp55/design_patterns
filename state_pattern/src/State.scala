trait State {
  def insertQuarter(): Unit

  def getRefund(): Unit

  def turnCrank(): Unit

  def dispense(): Unit
}

case class NoQuarterState(gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = {
    println("You inserted a quarter")
    gumballMachine.setState(HasQuarterState(gumballMachine))
  }

  override def getRefund(): Unit = println("You haven't inserted a quarter")

  override def turnCrank(): Unit = println("You can only turn the crank after you've inserted a quarter")

  override def dispense(): Unit = println("You need to insert a quarter and insert the crank")
}

case class HasQuarterState(gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = println("You have already inserted a quarter")

  override def getRefund(): Unit = {
    println("Quarter returned")
    gumballMachine.setState(NoQuarterState(gumballMachine))
  }

  override def turnCrank(): Unit = {
    println("Crank turned; sale has been made")
    gumballMachine.setState(SoldState(gumballMachine))
  }

  override def dispense(): Unit = println("You must turn the crank first")
}

case class SoldState(gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = println("You have already paid for a gumball, please wait")

  override def getRefund(): Unit = println("Sorry, but you already turned the crank")

  override def turnCrank(): Unit = println("You cannot turn the crank twice")

  override def dispense(): Unit = {
    gumballMachine.releaseGumball()

    if (gumballMachine.gumballCount == 0) {
      println("Sorry, but the machine has run out of gumballs")
      gumballMachine.setState(SoldState(gumballMachine))
    } else {
      gumballMachine.setState(NoQuarterState(gumballMachine))
    }
  }
}

case class SoldOutState(gumballMachine: GumballMachine) extends State {
  override def insertQuarter(): Unit = println("Sorry, there are no more gumballs")

  override def getRefund(): Unit = println("Sorry, but you haven't paid and the machine is out of gumballs")

  override def turnCrank(): Unit = println("Sorry, but you haven't paid and the machine is out of gumballs")

  override def dispense(): Unit = println("Sorry, but there are no gumballs to dispense")
}

