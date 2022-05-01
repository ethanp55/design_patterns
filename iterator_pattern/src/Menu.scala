trait Menu {
  def createIterator(): Iterator

  def printMenuItems(): Unit
}

case class MenuItem(description: String, price: Double) {
  override def toString: String = s"$description: Price = $price"
}

case class DinerMenu() extends Menu {
  val menuItems: Array[MenuItem] = Array(MenuItem("Hamburger", 8.99), MenuItem("Fried Chicken", 10.50), MenuItem("Coffee", 1.89))

  override def createIterator(): Iterator = DinerMenuIterator(menuItems)

  override def printMenuItems(): Unit = {
    val iterator = createIterator()

    while (iterator.hasNext()) {
      println(iterator.next())
    }
  }
}

case class WaffleMenu() extends Menu {
  val menuItems: List[MenuItem] = List(MenuItem("Waffles", 5.50), MenuItem("French Toast", 6.99))

  override def createIterator(): Iterator = WaffleMenuIterator(menuItems)

  override def printMenuItems(): Unit = {
    val iterator = createIterator()

    while (iterator.hasNext()) {
      println(iterator.next())
    }
  }
}
