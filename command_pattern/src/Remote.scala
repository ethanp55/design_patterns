case class Remote() {
  var buttonMap: Map[Int, Option[Command]] = Map(0 -> None, 1 -> None)
  var recentCommand: Option[Command] = None

  def changeButton(buttonNum: Int, newCommand: Command): Unit = {
    buttonMap = buttonMap.map { case (button, currCommand) =>
      if (button == buttonNum) (buttonNum, Some(newCommand))
      else (button, currCommand)
    }
  }

  def pressButton(buttonNum: Int): Unit = {
    buttonMap.getOrElse(buttonNum, None).map{ command =>
      command.execute()
      recentCommand = Some(command)
    }.getOrElse(println("Command not found"))
  }

  def undo(): Unit = {
    recentCommand.map(command => command.undo()).getOrElse(println("No recent action to undo"))
  }
}