
public class SuperKeyword {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}

class Parent {
    void display() {
        System.out.println("Display method in Parent class.");
    }
}

class Child extends Parent {
    @Override
    void display() {
        super.display();
        System.out.println("Display method in Child class.");
    }
}
