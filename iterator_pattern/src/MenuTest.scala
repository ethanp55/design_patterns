object MenuTest extends App {
  val dinerMenu: DinerMenu = DinerMenu()
  val waffleMenu: WaffleMenu = WaffleMenu()

  println("Diner menu items:")
  dinerMenu.printMenuItems()

  println("\nWaffle menu items:")
  waffleMenu.printMenuItems()
}
