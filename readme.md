## How to know whether to use an abstract class or an interface
1. Use an `abstract class` when you want to define a template for a group of subclasses, and you at least some implementation code that all subclasses could use. Make the class abstract when you want to guarantee that nobody can make objects of that type.
2. Use an `interface` when you want to define a `role` that other classes can play, regardless of where those classes are in the inheritance tree.

## Heap and stack
  * Garbage-collectible-heap: where the objects live
  * stack: where method invocations and local variables live
 
## Serialization
 # Writing a serialized object to a file
   * Make a FileOutputStream. This knows how to connect to(and create) a file.
     `FileOutputStream fileStream = new FileOutputStream("MyGame.ser")`

   * Make an ObjectOutputStream. This lets you write objects, but it can't directly connect to a file. It needs to be fed a 'helper'. This is called "chaining" one stream to another.
     `ObjectOutputStream os = new ObjectOutputStream(fileStream);`

   * Write the object
     `os.writeObject(characterOne);`