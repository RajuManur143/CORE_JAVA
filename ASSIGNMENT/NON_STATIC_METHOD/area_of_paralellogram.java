package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_paralellogram {

    void area_of_paralellogram1() {
        int height = 10;
        int base = 10;
        int res = height * base;
        System.out.println("Area of parallelogram is = "+res);
    }
    
    public static void main(String[] args) {

        new area_of_paralellogram().area_of_paralellogram1();
    }
}
