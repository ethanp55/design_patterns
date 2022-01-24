case class HomeTheaterFacade(popcornPopper: PopcornPopper, projector: Projector, soundSystem: SoundSystem) {
  def watchMovie(moveTitle: String): Unit = {
    println(s"Watching $moveTitle")
    popcornPopper.on()
    popcornPopper.pop()
    projector.on()
    projector.setMode("Full Screen")
    soundSystem.on()
    soundSystem.volumeUp()
  }

  def shutDown(): Unit = {
    popcornPopper.off()
    projector.off()
    soundSystem.volumeDown()
    soundSystem.off()
  }
}