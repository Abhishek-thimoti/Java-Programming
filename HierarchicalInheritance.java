class Aninmal {
    void makeSound(){
        System.out.println("Animal can make sound.");
    }
    void eat() {
        System.out.println("Animal can eat.");
    }
}
class Cat extends Aninmal {
    void meow(){
        System.out.println("Cat meows.");
    }
}
class Dog extends Aninmal {
    void bark(){
        System.out.println("Dog barks.");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        dog.bark();
    }
}