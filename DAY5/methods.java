package DAY5;

public class methods {

    // Addition 
    public static void add() {
        int a = 10;
        int b = 20;
        int addition = a + b;
        System.out.println(addition);
    }

    // Substration
    public static void sub() {
        int a = 20;
        int b = 10;
        int substraction = a - b;
        System.out.println(substraction);
    }

    // Multiplication
    public static void multi() {
        int a = 20;
        int b = 10;
        int multiplication = a * b;
        System.out.println(multiplication);
    }

    // Division
    public static void div() {
        int a = 20;
        int b = 5;
        float division = a / b;
        System.out.println(division);
    }

    // Modulus
    public static void mod() {
        int a = 20;
        int b = 3;
        int modulus = a % b;
        System.out.println(modulus);
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Starting the main method");

        // Function call or invoke
        add(); 
        sub();
        multi();
        div();
        mod();

        System.out.println("End of the main method");
    }
}
