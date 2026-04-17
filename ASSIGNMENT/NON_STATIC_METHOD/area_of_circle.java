package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_circle {


    void area_of_circle1() {
        final double PI = 3.142;
        int r = 15;
        double res = PI * r * r;
        System.out.println("Area of circle is = "+res);
}

    public static void main(String[] args) {

        new area_of_circle().area_of_circle1();
        
    }
}
