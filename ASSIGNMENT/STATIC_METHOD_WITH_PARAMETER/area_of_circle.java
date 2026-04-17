package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_circle {

    static void area_of_circle1(int r) {

    final double PI = 3.142;
    double res = PI * r * r;
    System.out.println("Area of circle is = "+res);

    }

}

public class area_of_circle {

    public static void main(String[] args) {

        Innerarea_of_circle.area_of_circle1(10);

    }
    
}

