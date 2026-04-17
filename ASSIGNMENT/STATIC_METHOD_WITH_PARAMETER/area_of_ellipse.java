package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_ellipse {

    static void area_of_ellipse1(int a, int b) {

        double res =  a * b;
        System.out.println("Area of ellipse is = "+res);
    }
}

public class area_of_ellipse {
    
    public static void main(String[] args) {

        Innerarea_of_ellipse.area_of_ellipse1(10, 20);
    }
}
