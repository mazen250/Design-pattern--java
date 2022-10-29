# Design-pattern--java

This repo is for design patterns in java 

feel free to use it

#Strategy pattern : strategy pattern is used when you have a super class that has a methods which their implementation could vary from class (inherit from the super class)
to another.
so we need to create an interface for this method and provide some implementation for this method and the super class can have that interface by default to make sure
that the class will have this method by default, when we inherit that class in another child class we could set the behavior of the method as we want
so we now can make sure that the super class has all needed method and every subclass could get the behavior that he needs from the super class method

CODE EXAMPLE Explaination:
  We have a super class of animal that has name and age and one method of fly
  then we have a subclass of dog and bird, every class of them will inherit from the super animal class but now dog will inherit fly method from animal class
  so, we create an interface for the animal class and implements that interface in two classes, canFly and canotFly and we take that interface and put it in the super 
  class and when we define a new instance of the dog class or the bird class we can set or get the flyingAblility interface
  
 
