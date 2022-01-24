case class PopcornPopper() {
  def on(): Unit = println("Popper is on")

  def pop(): Unit = println("Popping some popcorn")

  def off(): Unit = println("Popper is off")
}

case class Projector() {
  def on(): Unit = println("Projector is on")

  def setMode(mode: String): Unit = println(s"Setting mode to: $mode")

  def off(): Unit = println("Projector is off")
}

case class SoundSystem() {
  def on(): Unit = println("Sound is on")

  def volumeUp(): Unit = println("Turning volume up")

  def volumeDown(): Unit = println("Turning volume down")

  def off(): Unit = println("Sound is off")
}