trait Command {
  def execute(): Unit

  def undo(): Unit
}

case class LightOnCommand(light: Light) extends Command {
  override def execute(): Unit = light.on()

  override def undo(): Unit = light.off()
}

case class LightOffCommand(light: Light) extends Command {
  override def execute(): Unit = light.off()

  override def undo(): Unit = light.on()
}