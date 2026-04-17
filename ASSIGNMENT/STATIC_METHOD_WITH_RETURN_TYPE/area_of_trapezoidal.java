package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;


public class Innerarea_of_trapezoidal {

    static double area_of_trapezoid() {

        int a = 10;
        int b = 10;
        int h = 20;
        double res = 0.5 * (a + b) * h;
        return res;
    }
}

public class area_of_trapezoidal {
    
    public static void main(String[] args) {

        double x = Innerarea_of_trapezoidal.area_of_trapezoid();
        System.out.println(x);
    }
}
