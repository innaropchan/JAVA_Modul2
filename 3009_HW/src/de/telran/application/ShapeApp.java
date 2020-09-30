package de.telran.application;

import de.telran.data.*;

public class ShapeApp {
    public static void main(String[] args) {
        Shape shape = new Circle(Color.RED, 12);
        Circle circle1 = new Circle(Color.BLACK, 5);
        Shape square = new Square(Color.GREEN, 8);

        Circle c1 = new Circle(Color.BLACK, 10);
        Circle c2 = new Circle(Color.BLUE, 5);

        Square sq1 = new Square(Color.YELLOW, 6);
        Square sq2 = new Square(Color.RED, 7);

        Rectangle r1 = new Rectangle(Color.GREEN, 4, 7);
        Rectangle r2 = new Rectangle(Color.RED, 6, 2);

        Triangle tr1 = new RightTriangle(Color.YELLOW, 4, 4);
        Shape tr2 = new EquilateralTriangle(Color.BLACK, 7);

        Shape[] shapes = {shape, circle1, square, c1, c2, sq2, sq1, r1, r2, tr1, tr2};

        // Shape.displayAreaFromShapesArray(shapes);

        System.out.println(Shape.findMaxShapeByAre(shapes));
        System.out.println();
        printArray(Shape.getShapesByColor(shapes, Color.RED));
        System.out.println("---------------");
        printArray(Shape.getShapesByShapes(shapes, "Circle"));
    }

    public static void printArray(Object[] objects) {
        for (Object o : objects) {
            System.out.println(o);
        }
    }
}
