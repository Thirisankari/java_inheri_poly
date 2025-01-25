
public class AbstractClassDemo {
    public static void main(String[] args) {
        Bird parrot = new Parrot();
        parrot.fly();
        parrot.eat();
    }
}

abstract class Bird {
    abstract void fly();
    
    void eat() {
        System.out.println("Bird is eating.");
    }
}

class Parrot extends Bird {
    @Override
    void fly() {
        System.out.println("Parrot is flying.");
    }
}
