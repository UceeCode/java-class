package Inheritance;

public class Puppy extends Animal {

    // Constructor for Puppy class
    public Puppy(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    // Additional methods specific to Puppy, if needed
    public void Weep() {
        System.out.println(name + " is weeping");
    }

    public static void main(String[] args) {
        // Creating an instance of Puppy
        Puppy myPuppy = new Puppy("Puppy");

        // Calling methods from both Animal and Puppy classes
        myPuppy.Eating();
        myPuppy.Weep();
    }
}
