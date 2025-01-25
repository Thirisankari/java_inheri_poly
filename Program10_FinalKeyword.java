
public class FinalKeyword {
    public static void main(String[] args) {
        FinalClassDemo demo = new FinalClassDemo();
        demo.display();
    }
}

final class FinalClassDemo {
    void display() {
        System.out.println("This is a final class.");
    }
}
