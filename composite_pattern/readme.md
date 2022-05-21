This module contains a basic example of the composite pattern.  This pattern is useful when you have a tree-like structure of objects that you would like to treat the same.  In this example, we have menus which are composed of menu items or other menus (i.e. a diner menu with a dessert menu at the end).  One can create menus and add other menus or menu items to it.  However, since we are treating the objects the same, some functions for menus do not work and vice versa; for example, it is illogical for a menu to have a price, while adding a menu or menu item to an existing menu item does not make sense and should not work.  This is one of the tradeoffs of the composite pattern (safety vs. convenience and understandability)