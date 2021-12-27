object RemoteTest extends App {
  // Create the commands
  val light = Light()
  val onCommand = LightOnCommand(light)
  val offCommand = LightOffCommand(light)

  // Create remote
  val remoteControl = Remote()
  remoteControl.changeButton(0, onCommand)
  remoteControl.changeButton(1, offCommand)

  // Press buttons on the remote
  remoteControl.pressButton(5)
  remoteControl.undo()
  remoteControl.pressButton(0)
  remoteControl.undo()
  remoteControl.pressButton(1)
  remoteControl.undo()
}