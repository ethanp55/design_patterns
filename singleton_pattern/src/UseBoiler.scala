object UseBoiler extends App {
  // Should initially be empty
  ChocolateBoiler.printState()

  // Should fill as expected
  ChocolateBoiler.fill()
  ChocolateBoiler.printState()

  // Shouldn't drain since the contents aren't boiling
  ChocolateBoiler.drain()
  ChocolateBoiler.printState()

  // Should boil since the previous drain shouldn't have worked
  ChocolateBoiler.boil()
  ChocolateBoiler.printState()

  // Should now drain since the container is full and the contents are boiling
  ChocolateBoiler.drain()
  ChocolateBoiler.printState()
}