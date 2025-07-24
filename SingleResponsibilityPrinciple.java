class Invoice {
    void calculateTotal() {
        System.out.println("Calculating total...");
    }
}

class InvoicePrinter {
    void printInvoice() {
        System.out.println("Printing invoice...");
    }
}

public class SingleResponsibilityPrinciple {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.calculateTotal();

        InvoicePrinter printer = new InvoicePrinter();
        printer.printInvoice();
    }
}