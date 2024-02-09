class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Polymorphic behavior
        myAnimal.makeSound();  // Calls the makeSound() method in Animal class
        myDog.makeSound();     // Calls the makeSound() method in Dog class
        myCat.makeSound();     // Calls the makeSound() method in Cat class
    }
}
