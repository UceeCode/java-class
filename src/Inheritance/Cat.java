package Inheritance;

public class Cat extends Animal {

    // Constructor for Cat class
    public Cat(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    // Additional methods specific to Cat, if needed
    public void Weep() {
        System.out.println(name + " is meowing");
    }

    public static void main(String[] args) {
        // Creating an instance of Cat, not Puppy
        Cat myCat = new Cat("Cat");

        // Calling methods from both Animal and Cat classes
        myCat.Eating();
        myCat.Weep();
    }
}
