class LiskovSubstitutionPrinciple {
    public void startTransport() {
        System.out.println("Starting generic transport...");
    }
}

class Bus extends LiskovSubstitutionPrinciple {
    public void startTransport() {
        System.out.println("Bus is starting on highway...");
    }
}

class Train extends LiskovSubstitutionPrinciple {
    public void startTransport() {
        System.out.println("Train is starting on track...");
    }

    public static void main(String[] args) {
        LiskovSubstitutionPrinciple bus = new Bus();
        bus.startTransport();

        LiskovSubstitutionPrinciple train = new Train();
        train.startTransport();
    }
}
