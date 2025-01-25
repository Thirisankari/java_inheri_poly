
public class OverridingVsOverloading {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.run();
        
        MathUtil math = new MathUtil();
        System.out.println(math.calculate(5));
        System.out.println(math.calculate(5, 10));
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running.");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("Car is running.");
    }
}

class MathUtil {
    int calculate(int a) {
        return a * a;
    }
    
    int calculate(int a, int b) {
        return a * b;
    }
}
