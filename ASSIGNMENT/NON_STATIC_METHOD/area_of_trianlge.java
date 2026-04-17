package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_trianlge {

    void area_of_trianlge1() {
        int base = 10;
        int height = 20;
        double res = 0.5 * base * height;
        System.out.println("Area of triangle is = "+res);
    }
    public static void main(String[] args) {

        // Inovke the method with creating objects
        new area_of_trianlge().area_of_trianlge1();
        
    }
}
