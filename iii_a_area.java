package JavaImpQues;
class figure {
    // SQUARE
    figure(int a) {
        int result = a*a;
        System.out.println("Area of Square is " + result);
    }
    figure(int l, int b) {
        int result = l * b;
        System.out.println("Area of rectangle is " + result);
    }
    figure(double b, double h) {
        double result = (b * h)/2;
        System.out.println("Area of Triangle is " + result);
    }
}
public class iii_a_area {
    public static void main(String[] args) {
        figure square = new figure(5.0, 6.0);
    }
}
