package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_square1 {

    static int area_of_square() {

        int a = 10;
        int res = a * a;
        return res;
    }
}

public class area_of_square1 {
    
    public static void main(String[] args) {

        int x = Innerarea_of_area_square.area_of_square();
        System.out.println(x);
    }
}
