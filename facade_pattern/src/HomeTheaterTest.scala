object HomeTheaterTest extends App {
  val homeTheaterFacade: HomeTheaterFacade = HomeTheaterFacade(PopcornPopper(), Projector(), SoundSystem())

  println("STARTING UP AND WATCHING A MOVIE")
  homeTheaterFacade.watchMovie("The Gentlemen")
  println("....................................")

  println("MOVIE OVER - SHUTTING DOWN")
  homeTheaterFacade.shutDown()
}