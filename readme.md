## How to know whether to use an abstract class or an interface
1. Use an `abstract class` when you want to define a template for a group of subclasses, and you at least some implementation code that all subclasses could use. Make the class abstract when you want to guarantee that nobody can make objects of that type.
2. Use an `interface` when you want to define a `role` that other classes can play, regardless of where those classes are in the inheritance tree.
