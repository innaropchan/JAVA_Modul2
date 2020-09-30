package de.telran.data;

public abstract class Shape {

    private Color color;
    private de.telran.data.Shape shape;

    public Shape(Color color) {
        this.color = color;
        this.shape = shape;
    }

    public de.telran.data.Shape getShape() {
        return shape;
    }

    public void setShape(de.telran.data.Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void printMessage() {
        System.out.println("Hello");
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape: ";
    }

    public static void displayAreaFromShapesArray(de.telran.data.Shape[] shapes) {
        for (de.telran.data.Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }

    public static de.telran.data.Shape findMaxShapeByAre(de.telran.data.Shape[] shapes) {
        de.telran.data.Shape max = shapes[0];
        double maxArea = max.getArea();
        for (de.telran.data.Shape s : shapes) {
            double area = s.getArea();
            if (area > maxArea) {
                max = s;
                maxArea = area;
            }
        }
        return max;
    }

    private static int numberShapesByColor(de.telran.data.Shape[] shapes, Color color) {
        int count = 0;
        for (de.telran.data.Shape s : shapes) {
            if (s.getColor().equals(color)) {
                count++;
            }
        }
        return count;
    }

    public static de.telran.data.Shape[] getShapesByColor(de.telran.data.Shape[] shapes, Color color) {
        de.telran.data.Shape[] shapesByColor = new de.telran.data.Shape[numberShapesByColor(shapes, color)];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getColor().equals(color)) {
                shapesByColor[index] = shapes[i];
                index++;
            }
        }
        return shapesByColor;
    }

    private static int countShapeByShape(de.telran.data.Shape[] shapes, String shape) {
        int count = 0;
        for (de.telran.data.Shape s : shapes) {
            if (s.getClass().getSimpleName().equalsIgnoreCase(shape)) {
                count++;
            }
        }
        return count;
    }

    public static de.telran.data.Shape[] getShapesByShapes(de.telran.data.Shape[] shapes, String shape) {
        de.telran.data.Shape[] shapesByShapes = new de.telran.data.Shape[countShapeByShape(shapes, shape)];
        int index = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].getClass().getSimpleName().equalsIgnoreCase(shape)) {
                shapesByShapes[index] = shapes[i];
                index++;
            }
        }
        return shapesByShapes;
    }
}