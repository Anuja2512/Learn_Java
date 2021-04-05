/*
Write a java program to create an abstract class named shape that
contains two integers and an empty method named printArea().
Provide three classes named Rectangle, Triangle and Circle such that classes contain only
the method printArea() that prints the area of the given shape.
*/

import java.util.*;

interface Shape{
    Scanner sc= new Scanner(System.in);
    void printArea();
}

class Rectangle implements Shape{

    public void printArea() {
        int a, b;
        System.out.println("Area of a Rectangle:");
        System.out.print("Length: ");
        a = sc.nextInt();
        System.out.print("Breadth: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle is: "+a*b+"\n");
    }
}

class Triangle implements Shape{

    public void printArea() {
        int a, b;
        System.out.println("Area of a Triangle:");
        System.out.print("Base: ");
        a = sc.nextInt();
        System.out.print("Height: ");
        b = sc.nextInt();
        System.out.println("Area of Triangle is: "+((a*b)/2)+"\n");
    }
}

class Circle implements Shape{

    public void printArea() {
        int a;
        System.out.println("Area of a Circle:");
        System.out.print("Radius: ");
        a = sc.nextInt();
        System.out.println("Area of Circle is: "+(3.14*a*a)+"\n");
    }
}

public class Shapes {

    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape c = new Circle();

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
