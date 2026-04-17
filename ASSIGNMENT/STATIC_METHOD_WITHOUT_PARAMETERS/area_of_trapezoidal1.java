package ASSIGNMENT.STATIC_METHOD_WITHOUT_PARAMETERS;

public class Innerarea_of_trapezoidal1 {

    static void area_of_trapezoidal() {

        int a = 10;
        int b = 10;
        int height = 20;
        double res = 0.5 *(a + b) * height;
        System.out.println("Area of trapezoidal is = "+res);
    }
}

public class area_of_trapezoidal1 {
    public static void main(String[] args) {

        Innerarea_of_trapezoidal1.area_of_trapezoidal();

    }
}
