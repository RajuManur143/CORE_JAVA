package ASSIGNMENT;

public class april14onparameters {

    // area of circle
    static void area_of_circle(int r) {

        // Area of circle
        final double PI = 3.142;
        double areaOfCircle = PI * r * r;
        System.out.println("Area of circl is = "+ areaOfCircle);
    }

    // area of rectangle
    static void are_of_rectanle(int height, int width) {

        int rectangle = height * width;
        System.err.println("Area of rectangle is = "+rectangle);

    }
    

    // Area of triangle
    static void are_of_triangle(int height, int width) {

        double triangle = 0.5 * height * width;
        System.out.println("Area of triangle is = "+triangle);
    }

    // ellipse
    static void area_of_ellipse(int a, int b) {
        final double PI = 3.14;
        double ellipse = PI * a * b;
        System.out.println("Area of ellipse is = "+ellipse);
    }
    // Trapezpoida
    static void area_of_trapezoidal(int a, int b, int h) {
        double trapezoid = 0.5 * (a + b) * h;
        System.out.println("Area of trapezoidal = "+trapezoid);
    }

    // Square
    static void area_of_square(int a) {
        int square = a * a;
        System.out.println("Area of square is = "+square);
    }

    // Paralellogram
    static void area_of_paralellogram(int a , int b)  {
        int paralellogram = a * b;
        System.out.println("Area of paralellogram  = "+paralellogram);
    }

    // Sector
    static void area_of_sector(int r, int Theta) {
        double sector = 0.5 * r * r * Theta;
        System.out.println("Area of sector is = "+sector);
    }

    // Main method 
    public static void main(String[] args) {

        // Method ivoke or call
        area_of_circle(100);
        are_of_rectanle(100, 100);
        are_of_triangle(20, 20);
        area_of_ellipse(10, 20);
        area_of_trapezoidal(10, 20, 30);
        area_of_square(10);
        area_of_paralellogram(10, 20);
        area_of_sector(5, 60);
    }
}
