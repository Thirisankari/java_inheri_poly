
public class InterfaceInheritance {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.makeCall();
        phone.browse();
    }
}

interface Phone {
    void makeCall();
}

interface Browser {
    void browse();
}

class SmartPhone implements Phone, Browser {
    @Override
    public void makeCall() {
        System.out.println("Making a call.");
    }
    
    @Override
    public void browse() {
        System.out.println("Browsing the internet.");
    }
}
