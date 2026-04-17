package ASSIGNMENT.NON_STATIC_METHOD;

public class area_of_sector {

    void area_of_sector1() {

        int r = 10;
        int Theta = 45;
        double res = 0.5 * r * r * Theta;
        System.out.println("Area of sector is = "+res);
    }
    
    public static void main(String[] args) {

            new area_of_sector().area_of_sector1();
    }
}
