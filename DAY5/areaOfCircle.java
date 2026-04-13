package DAY5;

public class areaOfCircle {
    static void areaofircle() {
        final double PI = 3.142;
        int radius = 10;

        // Area of circle formula is PI * r * r
        double result = PI * radius * radius;
        System.out.println("Area of circle is = "+result);

    }

    // Area of Triagnle is = 1/2 base * height
    static void areaoftriangle() {
        int base = 10;
        int height = 20;
        double result = 0.5 * base * height;
        System.out.println("Area of triangle is = "+result);
    }

    // Area of rectangle is = width * height
    static void areaofrectangle() {

        int width = 20;
        int height = 10;
        int areaofrect = width * height;
        System.out.println("Area of rectangle is = "+areaofrect);

    }


    // Area of Trapezoid
    static void areoftrapezoid() {
        int a = 10;
        int b = 20;
        int height = 10;
        double resultoftrapezoid = 0.5 *(a + b) * height;
        System.out.println("Area of trapezoid is = "+resultoftrapezoid);
    }

    // Area of Ellipse = PI * a * b
    static void areofellipse() {
        final double PI = 3.142;
        int a = 10;
        int b = 10;
        double ellips_eresult = PI * a * b;
        System.out.println("Area of Ellipse is = "+ellips_eresult);
        
    }

    // Area of square = a * a
    static void areofsquare() {
        int a = 10;
        int square_result = a * a;
        System.out.println("Area of Square is = "+square_result);
    }

    // Area of parallelogram = height * width
    static void areofparalellogram() {
        int height = 10;
        int width = 10;
        int parallelogram_result = height * width;
        System.out.println("Area of paralellogram = "+parallelogram_result);
    }

    // Area of sector = 1/2 * r^2 * Theta
    static void areaofsector() {
        int radius = 10;
        int Theta = 45;
        double sector_result = 0.5 * radius * radius * Theta;
        System.out.println("Area of sector is = "+sector_result);
    }

    // Main method
    public static void main(String[] args) {
        areaofircle();
        areaoftriangle();
        areaofrectangle();
        areoftrapezoid();
        areofellipse();
        areofsquare();
        areaofsector();

    }
}
