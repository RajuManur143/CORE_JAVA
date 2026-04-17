package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_trapezoidal {

    void area_of_trapezoidal1() {
        int a = 10;
        int b = 20;
        int height = 20;
        double res = 0.5 * (a + b) * height;
        System.out.println("Area of trapezoidal is = "+res);
    }
    
    public static void main(String[] args) {
        new area_of_trapezoidal().area_of_trapezoidal1();
    }
}
