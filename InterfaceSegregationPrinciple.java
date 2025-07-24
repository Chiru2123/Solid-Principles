interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class InterfaceSegregationPrinciple implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }

    public static void main(String[] args) {
        InterfaceSegregationPrinciple printer = new InterfaceSegregationPrinciple();
        printer.print();
    }
}
