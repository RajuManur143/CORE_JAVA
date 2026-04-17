package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_rectangle {

    static int area_of_rectangle1() {
        int a = 10;
        int b = 20;
        int res = a * b;
        return res;
    }
}

public class area_of_rectangle {
    
    public static void main(String[] args) {

        double x = Innerarea_of_rectangle.area_of_rectangle1();
        System.out.println(x);
    }
}
