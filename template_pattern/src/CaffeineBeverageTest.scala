object CaffeineBeverageTest extends App {
  val coffee: Coffee = Coffee()
  val coffeeCondiments = List("sugar", "cream")

  coffee.prepareBeverage(coffeeCondiments)

  val tea: Tea = Tea()
  val teaCondiments = List("honey")

  tea.prepareBeverage(teaCondiments)
}