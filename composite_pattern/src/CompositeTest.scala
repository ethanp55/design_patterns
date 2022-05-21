object CompositeTest extends App {
  val pancakeHouseMenu = Menu("Pancake House Menu", "Breakfast")
  val dinerMenu = Menu("Diner Menu", "Lunch")
  val cafeMenu = Menu("Cafe Menu", "Dinner")
  val dessertMenu = Menu("Dessert Menu", "Dessert")

  // Note that we can add menus or menu items since we treat them the same
  val allMenus = Menu("All Menus", "All menus combined")
  allMenus.add(pancakeHouseMenu)
  allMenus.add(dinerMenu)
  allMenus.add(cafeMenu)

  dinerMenu.add(MenuItem("Pasta", "Spaghetti with marinara sauce", vegetarian = true, 7.99))
  dinerMenu.add(dessertMenu)

  dessertMenu.add(MenuItem("Ice Cream Sundae",
    "Three scoops of ice cream of your choice, all on top of a banana or brownie", vegetarian = true, 4.75))

  allMenus.print()
}
