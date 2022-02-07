# Introduction to design patterns

### OOP
**Object oriented programming** is a paradigm based on the concept of objects that contain both object and code to modify the data. 
* **Objects** are constructed from a set of *bluprints*, defined by programmers called **classes**.
* Data stored inside object's fileds is often referenced as *state*, and all the object's methods define its behaviour.
* A *parent class* is called a **superclass** and its *childern class* are called **subclasses**. Subclasses inherit state and behavior from their parent, defining only attributes/features or behaviors that differ.
* Subclasses can override the behavior of methofs that they inherit from parent classes. A subclass can completely replace the default behavior or just enhance it with some extra stuff.

### OOPS Concepts
1. **Abstraction**: Only essentials details are displayed to user i.e. hiding implementation details and showing only the functionality to the user. In other worlds, it represents all details of the relevant context with high accuracy and omits the rest.
2. **Encapsulation**: Ability of an object to hide parts of its state and behavior from other objects, exposing only a limited interface to the rest of the program. 
    * To Encapsulate something is to make it *private*.
    * Thus accessible only from within of the methods of its own class.
3. **Inheritance**: It is the ability to build new classes on top of existing ones. 
    * Major benefits of inheritance is code reuse.
4. **Polymorphism**: It is the ability of an object to pretend to be something else, usually a class it extends or an interface it implements.
    * Ability of a program to detect the real class of an object and call its implementation even when its real tyoe is unknown in the current context. 
``` bag = [new Cat(), new Dog()];
    foreach (Animal a : bag)
        a.makesound()
```
* **Composition**: is a *whole-part* relationship i.e. strong relationship between two objects, one of which is composed of one or more instances of other. e.g. `University *-> Department`. 
* **Aggregation**: is a less strict variant of *composition* i.e. weak relationship, where one object merely contains a reference to another. The cotainer doesn't control the life cycle of component. e.g. `Department @-> Professor`.

