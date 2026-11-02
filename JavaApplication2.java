

abstract class Shape {
    // Encapsulation: private data
    private String color;

    // Constructor
    public Shape(String color) {
        this.color = color;
    }

    // Getter method
    public String getColor() {
        return color;
    }

    // Setter method
    public void setColor(String color) {
        this.color = color;
    }

    // Abstraction: abstract method
    public abstract double calculateArea();

    // Normal method
    public void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Inheritance: Circle inherits from Shape
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Polymorphism: method overriding
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Inheritance: Rectangle inherits from Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    // Polymorphism: method overriding
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class
public class JavaApplication2 {
    public static void main(String[] args) {

        // Creating objects
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        // Display circle information
        System.out.println("Circle Information:");
        circle.displayColor();
        System.out.printf("Area: %.2f%n", circle.calculateArea());

        System.out.println();

        // Display rectangle information
        System.out.println("Rectangle Information:");
        rectangle.displayColor();
        System.out.printf("Area: %.2f%n", rectangle.calculateArea());

        // Encapsulation: changing the color
        circle.setColor("Green");

        System.out.println();
        System.out.println("Updated Circle Color:");
        circle.displayColor();
    }
}