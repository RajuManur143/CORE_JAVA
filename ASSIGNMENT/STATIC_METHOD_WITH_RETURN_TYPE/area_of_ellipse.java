package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_ellipse {

    static double area_of_ellipse1() {

        int a = 10
        final double PI = 3.142;
        int b = 10;
        double res = PI * a * b;
        return res;
    }
}

public class area_of_ellipse {
    
    public static void main(String[] args) {

        double x = Innerarea_of_ellipse.area_of_ellipse1();
        System.out.println(x);
    }
}
