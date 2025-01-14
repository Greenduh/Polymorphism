package app;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(10),
                new Triangle(5, 5),
                new Square(6)
        };

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.printf("Площа всіх фігур: %.2f\n", totalArea);
    }
}