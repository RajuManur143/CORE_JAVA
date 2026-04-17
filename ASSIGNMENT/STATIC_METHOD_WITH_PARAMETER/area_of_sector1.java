package ASSIGNMENT.STATIC_METHOD_WITH_PARAMETER;

public class Innerarea_of_sector1 {

    static void area_of_sector(int r, int Theta) {

        double res =  0.5 * r * r * Theta;
        System.out.println("Area of sector is = "+res);
    }
}

public class area_of_sector1 {
    
    public static void main(String[] args) {

        Innerarea_of_sector1.area_of_sector(10, 45);
    }
}
