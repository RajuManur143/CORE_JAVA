package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_trapezoid {

    static void area_of_trapezoidal1(int a, int b, int h) {

        double res = 0.5 * (a +  b) * h;
        System.out.println("Area of trapezoid is = "+ res);

    }
}

public class area_of_trapezoid {
    public static void main(String[] args) {

        Innerarea_of_trapezoid.area_of_trapezoidal1(10, 20, 30);

    }
}
