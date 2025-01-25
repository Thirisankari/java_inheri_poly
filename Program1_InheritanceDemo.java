
public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
        dog.eat();
    }
}

class Animal {
    void speak() {
        System.out.println("Animal makes a sound.");
    }
    
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks.");
    }
}
