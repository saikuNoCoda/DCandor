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
```python
    bag = [new Cat(), new Dog()];
    foreach (Animal a : bag)
        a.makesound()
```
* **Composition**: is a *whole-part* relationship i.e. strong relationship between two objects, one of which is composed of one or more instances of other. e.g. `University *-> Department`. 
* **Aggregation**: is a less strict variant of *composition* i.e. weak relationship, where one object merely contains a reference to another. The cotainer doesn't control the life cycle of component. e.g. `Department @-> Professor`.


### Design pattern
Design pattern is a general repeatable solutions to commonly occurring problems in software design. They are pre-made blueprints i.e. description or template that can be customized to solve recurring design problem in code.

### Patterns vs algorithms
Algorithm defines a clear set of actions that can achieve some goal, a pattern is a more high-level description of a solution. So same pattern can be applied to different programs in a completely different way.

`Note` - Design patterns are both smaller and more abstract than frameworks. They are really a description about how a couple of classes can relate to and interact with each other.

### Different design pattern types
Design patterns differ by their complexity, level of details and scale of applicability to the entire system being designed.

Three major groups of patterns:

1. **Creational patterns**: proivide object creation mechanims that increase flexibilty and reuse of existing code. Its all about class instantiation.
2. **Structural patterns**: explains how to assemble objects and classes into larger structures, while keeping the structures flexible and efficient. Its all about Class and Object composition.
3. **Behavioral patterns***: take care of effective communication and the assignment of responsibility between objects. Its all  Class's objects communication.

`Thought`:- If someone asks you to change something, that means someone still cares about it.


### Design Principles

* **Encapsulate what varies**: Identify the aspects of your application that vary and separate them from what stays the same.

Isolate the parts of the program that vary in independent modules, protecting the rest of the code from adverse effects. As a result less time is spend on getting the program back to working shape, implementing and testing the changes. So the less time spent on making changes, the more time for implementing the features.

* **Program to an interface, not an implementation**: Depend on abstraction, not on concrete class.

* **Favor composition over inheritance**: 