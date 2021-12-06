object ChocolateBoiler {
  private var empty: Boolean = true
  private var boiled: Boolean = false

  def fill(): Unit = {
    if (empty) {
      empty = false
      boiled = false
    }
  }

  def drain(): Unit = {
    if (!empty && boiled) {
      empty = true
      boiled = false
    }
  }

  def boil(): Unit = {
    if (!empty && !boiled) {
      boiled = true
    }
  }

  def printState(): Unit = println(s"Container is empty: $empty ----- Contents are boiling: $boiled")
}