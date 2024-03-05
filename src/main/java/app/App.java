package app;


import geoUtil.HalfRectangle;
import geoUtil.RectangleInterface;
import geometricFigures.Circle;
import geometricFigures.Figure;
import geometricFigures.Rectangle;
import geometricFigures.Triangle;
import threeDimensional.Cube;
import threeDimensional.Sphere;

public class App {
    public static void main(String[] args) {
        Figure circle = new Circle(5.0);
        Figure rectangle = new Rectangle(4.0, 6.0);
        Figure triangle = new Triangle(3.0, 4.0, 5.0);
        HalfRectangle halfRectangle = new HalfRectangle();
        RectangleInterface rectangleInterface = new HalfRectangle();

        Figure sphere = new Sphere(5.0);
        Cube cube = new Cube(5.0);

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
        halfRectangle.halfRectangle(rectangle);

        System.out.println("\nRectangleInterface");
        rectangleInterface.halfRectangle(rectangle);

        System.out.println("\nSphere Radius: " + sphere.getRadius());
        System.out.println("Sphere Surface Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.perimeter());

        System.out.println("\nCube Side Length: " + cube.getSideLength());
        System.out.println("Cube Surface Area: " + cube.calculateSurfaceArea());
        System.out.println("Cube Volume: " + cube.calculateVolume());
    }
}