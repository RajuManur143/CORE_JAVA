package ASSIGNMENT.STATIC_METHOD_WITH_RETURN_TYPE;

public class Innerarea_of_sector {

    static double area_of_sector1() {
        int Theta = 45;
        int r = 10;
        double res = 0.5 * r * r * Theta;
        return res;
    }
}

public class area_of_sector {
    
    public static void main(String[] args) {

        double x = Innerarea_of_sector.area_of_sector1();
        System.out.println(x);
    }
}
