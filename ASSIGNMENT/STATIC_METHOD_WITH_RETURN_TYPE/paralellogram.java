package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerparalellogram {

    static int area_of_paralellogram() {

        int a = 10;
        int b = 20;
        int res = a * b ;
        return res;
    }
}

public class paralellogram {
    
    public static void main(String[] args) {

        int x = Innerparalellogram.area_of_paralellogram();
        System.out.println(x);
    }
}
