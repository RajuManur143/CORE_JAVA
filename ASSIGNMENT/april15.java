package ASSIGNMENT;

public class april15 {

    // Area of circle
    static double area_of_circle() {
        final double PI = 3.14;
        int r = 10;
        double res = PI * r * r;
        return res;
    }   

    // Area of circle
    static int area_of_rectangle() {
        int a = 10;
        int b = 20;
        int res = a * b;
        return res;
    }

    // Area of triangle
    static double area_triangle() {
        int height = 10
        int base = 20;
        double res = 0.5 * height * base;
        return res;
    }

    // Area of square
    static int area_of_square() {
        int a = 10;
        int res =  a * a;
        return res;
    }

    // ellipse
    static double area_of_ellipse() {

        final double PI = 3.14;
        int a = 10;
        int b = 20;
        double res = PI * a * b;
        return res;
    }

    // Trapezoide
    static double area_of_trapezoidal() {
        int a = 10;
        int b = 20;
        int height = 10;
        double res = 0.5 * (a + b) * height;
        return res;
    }

    // Area of paralellogram
    static int area_of_paralellogram() {
        int a = 10;
        int b = 10;
        int res = a * b;
        return res;
    }

    // Area of sector
    static double area_of_sector() {
        int r = 10;
        int Theta = 45;
        double res = 0.5 * r * r * Theta;
        return res;
    }

    public static void main(String[] args) {

        double x = area_of_circle();
        System.out.println("Area of circle is = "+x);

        int x = area_of_rectangle();
        System.out.println(x);

        double x = area_triangle();
        System.out.println(x);

        int x = area_of_square();
        System.out.println(x);

        double x = area_of_ellipse();
        System.out.println(x);

        double x = area_of_trapezoidal();
        System.out.println(x);

        int x = area_of_paralellogram();
        System.out.println(x);

        double x = area_of_sector();
        System.out.println(x);

    }
}