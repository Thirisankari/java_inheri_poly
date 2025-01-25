
public class UpcastingDowncasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.speak();
        
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // Downcasting
            dog.fetch();
        }
    }
}

class Animal {
    void speak() {
        System.out.println("Animal speaks.");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks.");
    }
    
    void fetch() {
        System.out.println("Dog is fetching.");
    }
}
