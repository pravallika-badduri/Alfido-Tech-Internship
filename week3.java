week3.java

// Base class (Parent)
class Animal
 {
    void sound()
     {
        System.out.println("Animals make sounds");
    }
}

// Derived class (Child) inheriting from Animal
class Dog extends Animal
 {
    // Overriding the sound() method
    @Override
    void sound() 
    {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class OOPExample
 {
    public static void main(String[] args)
     {
        Animal myAnimal = new Animal(); 
        // Creating an Animal object
        myAnimal.sound(); 
        // Calls the Animal's sound method

        Dog myDog = new Dog();
         // Creating a Dog object
        myDog.sound(); 
        // Calls the overridden Dog's sound method
    }
}
