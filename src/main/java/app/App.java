package app;


import geoUtil.HalfRectangle;
import geometricFigures.Circle;
import geometricFigures.Figure;
import geometricFigures.Rectangle;
import geometricFigures.Triangle;

public class App {
    public static void main(String[] args) {
        Figure circle = new Circle(5.0);
        Figure rectangle = new Rectangle(4.0, 6.0);
        Figure triangle = new Triangle(3.0, 4.0, 5.0);
        HalfRectangle halfRectangle = new HalfRectangle();

        System.out.println("Circle radius:" + circle.getRadius());

        System.out.println("\nCircle:");
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());

        System.out.println("\nHalfRectangle");
        halfRectangle.halfRectangle(triangle);
    }
}