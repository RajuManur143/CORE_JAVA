package ASSIGNMENT.STATIC_METHOD_WITHOUT_PARAMETERS;

class sample {

    static void area_of_circle() {
    final double PI = 3.142;
    int r = 10;
    double res = PI * r * r;
    System.out.println("Area of circle is = "+res);

    }
}

public class area_of_circle1 {

    public static void main(String[] args) {

        sample.area_of_circle();
        
    } 
}
