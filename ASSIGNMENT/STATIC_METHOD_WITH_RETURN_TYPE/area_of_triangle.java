package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_triangle {

    static double area_of_triangle1() {

        int base = 10;
        int height = 20;
        double res = 0.5 * base * height;
        return res;
    }
}

public class area_of_triangle {
    
    public static void main(String[] args) {

        double x = Innerarea_of_triangle.area_of_triangle1();
        System.out.println("Area of triangle is = "+x);

    }
}
