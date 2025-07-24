class Bird {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

class Sparrow extends Bird {}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        Bird bird = new Sparrow();  // Substitution
        bird.fly();
    }
}