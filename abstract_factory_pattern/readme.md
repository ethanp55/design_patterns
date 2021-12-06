This module contains a basic example of the abstract factory pattern.  This pattern is useful when you want to easily create a family of objects.  In this example, we are creating different types of pizza, and we have an abstract factory that defines an interface that concrete factories must implement.  Within this interface there are methods for creating dough, sauce, cheese, veggies, and meat.  Whenever you want to create ingredients for a specific area, say New York City, you can create a concrete factory that creates NY-specific ingredients and use that factory when generating pizzas.  Since concrete factories implement an interface, your code that uses the factory doesn't need to know which specific type it is (which means it easy to swap factories if needed).