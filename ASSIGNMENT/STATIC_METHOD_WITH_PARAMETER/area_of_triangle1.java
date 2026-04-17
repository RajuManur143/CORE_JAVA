package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_triangle1 {

    static void area_of_triangle(int base, int height) {

    double res = 0.5 * base * height;
    System.out.println("Area of triangle is = "+res);
    
    }
}

public class area_of_triangle1 {
    
    public static void main(String[] args) {

        Innerarea_of_triangle1.area_of_triangle(10, 30);

    }
}
