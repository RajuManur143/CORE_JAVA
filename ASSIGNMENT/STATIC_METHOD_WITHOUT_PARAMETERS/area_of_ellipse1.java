package ASSIGNMENT.STATIC_METHOD_WITHOUT_PARAMETERS;

public class Innerarea_of_ellipse1 {

    static void area_of_ellipse() {
        int a = 10;
        int b = 20;
        final double PI = 3.142;
        double res = a * b * PI;
        System.out.println("Area of ellipse is = "+res);
    }
}

public class area_of_ellipse1 {
    public static void main(String[] args) {

        Innerarea_of_ellipse1.area_of_ellipse();
    }
}
