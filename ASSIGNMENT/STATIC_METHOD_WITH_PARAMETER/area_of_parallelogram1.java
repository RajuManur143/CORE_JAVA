package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_parallelogram1 {

    static void area_of_paralellogram(int b, int h) {

        int res = b * h;
        System.out.println("Area of parallelogram is = "+res);
    }
}

public class area_of_parallelogram1 {
    
    public static void main(String[] args) {

        Innerarea_of_parallelogram1.area_of_paralellogram(10, 20);
    }
}
