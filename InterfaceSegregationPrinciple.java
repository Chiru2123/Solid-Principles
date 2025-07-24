interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        MultiFunctionPrinter device = new MultiFunctionPrinter();
        device.print();
        device.scan();
    }
}