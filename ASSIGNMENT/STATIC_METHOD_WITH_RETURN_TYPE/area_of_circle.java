package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_circle {

    static double area_of_circle1() {
        final double PI = 3.142;
        int r = 10;
        double res = PI * r * r;
        return res;
    }
}

public class area_of_circle {
    
    public static void main(String[] args) {

        double x = Innerarea_of_circle.area_of_circle1();
        System.out.println(x);
    }
}
