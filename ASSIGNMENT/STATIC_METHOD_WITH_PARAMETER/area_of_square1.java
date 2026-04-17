package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_square1 {

    static void area_of_square(int a) {

        int res = a * a;
        System.out.println("Area of square is = "+res);
    }
}


public class area_of_square1 {
    
    public static void main(String[] args) {

        Innerarea_of_square1.area_of_square(10);
    }
}
