/* For simplicity, none of this does anything (aside from create different ingredient types), but you could add
* functionality as needed */
trait Dough

trait Sauce

trait Cheese

trait Veggie

trait Meat

case class ThinCrustDough() extends Dough

case class MarinaraSauce() extends Sauce

case class ReggianoCheese() extends Cheese

case class Garlic() extends Veggie

case class Onion() extends Veggie

case class RedPepper() extends Veggie

case class Pepperoni() extends Meat
