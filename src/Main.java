//import Inheritance.Cat;
//import Inheritance.Puppy;
//
//public class Main {
//    public static void main(String[] args) {
//        // Creating an instance of Puppy
//        Puppy myPuppy = new Puppy("Puppy");
//
//        // Calling methods from both Animal and Puppy classes
//        myPuppy.Eating();
//        System.out.println();
//
//        // Creating an instance of Cat
//        Cat myCat = new Cat("Cat");
//
//        // Calling methods from both Animal and Cat classes
//        myCat.Eating();
//        myCat.Weep();
//    }
//}

final class Vehicle {
    public String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }

    public void move(){
        System.out.printf("The car is moving");
    }
}

//class Car extends Vehicle {
//
//    public static void main(String[] args) {
//        Car myFastCar = new Car();
//        myFastCar.honk();
//        System.out.println(myFastCar.brand);
//    }
//}

class Van extends Vehicle {
    public static void main(String[] args) {
        Van myVan = new Van();
        myVan.move();
        System.out.println(myVan.brand);
    }
}



