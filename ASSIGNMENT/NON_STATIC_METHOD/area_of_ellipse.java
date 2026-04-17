package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_ellipse {

    void area_of_ellipse1() {
        final double PI = 3.143;
        int a = 10;
        int b = 20;
        double res = PI * a * b;
        System.out.println("Area of ellipse is = "+res);
    }
    
    public static void main(String[] args) {
        new area_of_ellipse().area_of_ellipse1();
    }
}
