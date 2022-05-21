import scala.collection.mutable.ListBuffer

trait MenuComponent {
  def add(menuComponent: MenuComponent): Unit

  def remove(menuComponent: MenuComponent): Unit

  def getChild(idx: Int): MenuComponent

  def getName(): String

  def getDescription(): String

  def getPrice(): Double

  def isVegetarian(): Boolean

  def print(): Unit
}

case class MenuItem(name: String, description: String, vegetarian: Boolean, price: Double) extends MenuComponent {
  override def add(menuComponent: MenuComponent): Unit = throw new Exception("Item cannot add components")

  override def remove(menuComponent: MenuComponent): Unit = throw new Exception("Item cannot remove components")

  override def getChild(idx: Int): MenuComponent = throw new Exception("Item does not have children")

  override def getName(): String = name

  override def getDescription(): String = description

  override def getPrice(): Double = price

  override def isVegetarian(): Boolean = vegetarian

  override def print(): Unit = println(s"$name: Price = $$$price, Vegetarian = $vegetarian, Description = $description")
}

case class Menu(name: String, description: String) extends MenuComponent {
  var menuComponents: ListBuffer[MenuComponent] = new ListBuffer[MenuComponent]()

  override def add(menuComponent: MenuComponent): Unit = menuComponents += menuComponent

  override def remove(menuComponent: MenuComponent): Unit = menuComponents -= menuComponent

  override def getChild(idx: Int): MenuComponent = menuComponents(idx)

  override def getName(): String = name

  override def getDescription(): String = description

  override def getPrice(): Double = throw new Exception("Component does not have a price")

  override def isVegetarian(): Boolean = throw new Exception("Component does not have a vegetarian option")

  override def print(): Unit = {
    println(s"$name: Description = $description, Components:")

    menuComponents.foreach(menuComponent => menuComponent.print())
  }
}