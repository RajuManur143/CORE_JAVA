package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_rectangle1 {

    static void area_of_rectangle(int height, int width) {
        int res = height * width;
        System.out.println("Area of rectangle is = "+res);
    }
}

public class area_of_rectangle1 {
    
    public static void main(String[] args) {

        Innerarea_of_rectangle1.area_of_rectangle(10, 20);
    }
}
