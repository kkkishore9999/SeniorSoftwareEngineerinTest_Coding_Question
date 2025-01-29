package org.core.questions;
/*Explanation:
Animal Interface (Animal.java): Declares the makeSound() method that all implementing classes must define.

Mammal Abstract Class (Mammal.java): Implements the Animal interface and provides a concrete implementation
of the breathe() method.

Dog Concrete Class (Dog.java): Extends the Mammal abstract class and provides an implementation
of the makeSound() method.

MainClass (MainClass.java): Contains the main method, which is the entry point of the program.
It creates an instance of Dog and calls the breathe() and makeSound() methods.*/

public class InterfacesAbstractClassesConcreteClasses {

    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();

        // Call methods
        dog.breathe();         // Inherited from Mammal
        dog.makeSound();       // Implemented in Dog
    }
}

