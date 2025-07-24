interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing using Wired Keyboard...");
    }
}

class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void useKeyboard() {
        keyboard.type();
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        Keyboard kb = new WiredKeyboard();
        Computer comp = new Computer(kb);
        comp.useKeyboard();
    }
}