trait Iterator {
  def hasNext(): Boolean

  def next(): Object
}

case class DinerMenuIterator(menuItems: Array[MenuItem]) extends Iterator {
  var position = 0

  override def hasNext(): Boolean = position < menuItems.length

  override def next(): MenuItem = {
    position += 1
    menuItems(position - 1)
  }
}

case class WaffleMenuIterator(menuItems: List[MenuItem]) extends Iterator {
  var position = 0

  override def hasNext(): Boolean = position < menuItems.length

  override def next(): MenuItem = {
    position += 1
    menuItems(position - 1)
  }
}