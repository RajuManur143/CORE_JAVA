package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_rectangle {

    void area_of_rectangle1() {
        int height = 10;
        int with = 20;
        int res = height * with;
        System.out.println("Area of rectangle is = "+res);
    }

    public static void main(String[] args) {
        new area_of_rectangle().area_of_rectangle1();
    }
}
