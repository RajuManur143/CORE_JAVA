package ASSIGNMENT.STATIC_METHOD_WITHOUT_PARAMETERS;

public class sample {

    static void area_of_rectangle() {
        int height = 10;
        int width = 10;
        int res = height * width;
        System.out.println("Area of rectangle is = "+res);
    }

    
}

public class area_of_rectangle1 {
    public static void main(String[] args) {

        sample.area_of_rectangle();

    }
}
