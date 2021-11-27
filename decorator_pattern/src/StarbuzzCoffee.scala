object StarbuzzCoffee extends App {
  val espresso: Beverage = Espresso()

  val doubleMochaWhip: Beverage = Mocha(Mocha(Whip(espresso)))
  val soyOnly: Beverage = Soy(espresso)

  println(s"A plain espresso costs $$${espresso.cost()}")
  println(s"An espresso with double mocha and whip costs $$${doubleMochaWhip.cost()}")
  println(s"An espresso with soy costs $$${soyOnly.cost()}")

  val houseBlend: Beverage = HouseBlend()

  val mochaWhipSoy: Beverage = Mocha(Whip(Soy(houseBlend)))

  println(s"A plain house blend costs $$${houseBlend.cost()}")
  println(s"A house blend with mocha, soy, and whip costs $$${mochaWhipSoy.cost()}")
}
