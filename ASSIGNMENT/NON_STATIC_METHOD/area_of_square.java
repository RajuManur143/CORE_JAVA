package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_square {

    void area_of_square1() {
        int a = 10;
        int res = a * a;
        System.out.println("Area of square is = "+res);
    }
    
    public static void main(String[] args) {

        new area_of_square().area_of_square1();
    } 
}
