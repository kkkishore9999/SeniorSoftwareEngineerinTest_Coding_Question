package org.core.questions;

class AbstractDemo1
{
    public static void main(String args[])
    {
        Shape shape;
        Rectangle r = new Rectangle();
        r.setDimensions(40,20);
        shape = r;
        System.out.println("Abstract Method print statement below line execution");
        shape.someMethod();
        System.out.println("Main Program area Rectangle "+shape.getArea());
        System.out.println("Main Program Perimeter Rectangle "+shape.getPerimeter());
        Square s = new Square();
        float side1 = s.side;
        side1= (float) (side1 + 2.5);
        System.out.print(side1);
        System.out.print(" \n Square Area "+ s.getArea());
    }
}
abstract class Shape
{
    void someMethod()
    {
        System.out.println("This is some method in Abstract class print statement");
    }
    abstract float getArea();
    abstract float getPerimeter();
}
class Square extends Shape
{
    float side;
    Square()
    {
        side = 0;
    }
    Square(float side)
    {
        this.side = side;
    }
    void setSide(float side)
    {
        this.side = side;
    }
    float getArea()
    {
        return side * side;
    }
    float getPerimeter()
    {
        return 4 * side;
    }
}

abstract class MyCircle extends MyShape
{
    private float radius;
    static float pi;
    static
    {
        pi = 22 / 7.0f;
    }
    MyCircle()
    {
        super("circle");
        radius = 0;
    }
    MyCircle(float radius)
    {
        super("circle");
        this.radius = radius;
    }
    void setDimensions(float radius)
    {
        this.radius = radius;
    }
    void showDimensions()
    {
        System.out.println("radius : " + radius);
    }
    float getArea()
    {
        return radius * radius * pi;
    }
}
class Rectangle extends Shape
{
    private float length;
    private float breadth;
    Rectangle()
    {
        length = breadth = 0;
    }
    Rectangle(float length, float breadth)
    {
        setDimensions(length, breadth);
    }
    void setDimensions(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    float getArea()
    {
        return length * breadth;
    }
    float getPerimeter()
    {
        return (2 * (length + breadth));
    }
}