package oop_concepts;

abstract class Shape {

    String color;

    // these are abstraction metheds
    abstract double area();
    public abstract String toString();

    //constrator
    Shape(String color) {
        System.out.println("Shape constractor called");
        this.color = color;
    }
    // this is a concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    double radius;
    Circle(double radius,String color){
        super(color);
        System.out.println("Cirlce constractor called");
        this.radius = radius;
    }
    @Override double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    @Override public String toString(){
        return "Circle color is " + super.color + " and area is: " + area();
    }
}

class Rectangle extends Shape{
    double length;
    double width;
    Rectangle(double length,double width,String color){
        super(color);
          System.out.println("Rectangle constractor called");
          this.length = length;
          this.width = width;
    }
    @Override double area(){
        return length * width;
    }
    @Override public String toString(){
        return "Rectangle color is " + super.color +" and area is: "+ area();
    }

    
}

public class Abstraction {

    public static void main(String[] args) {

        Shape circle = new Circle(2.2,"Green");
        Shape rectangle = new Rectangle(4.5,5.5,"Red");

        System.out.println(circle.toString());
         System.out.println(rectangle.toString());

    }
}
