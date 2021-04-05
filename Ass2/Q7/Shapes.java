import java.util.*;

interface Shape{
    Scanner sc= new Scanner(System.in);
    void printArea();
}

interface DisplayShape extends Shape{
    void display();
}

class Rectangle implements DisplayShape{

    public void printArea() {
        int a, b;
        System.out.println("Area of a Rectangle:");
        System.out.print("Length: ");
        a = sc.nextInt();
        System.out.print("Breadth: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle is: "+a*b+"\n");
    }
    public void display()
    {
        System.out.println("The Shape is a Rectangle.\n");
    }
}

class Triangle implements DisplayShape{

    public void printArea() {
        int a, b;
        System.out.println("Area of a Triangle:");
        System.out.print("Base: ");
        a = sc.nextInt();
        System.out.print("Height: ");
        b = sc.nextInt();
        System.out.println("Area of Triangle is: "+((a*b)/2)+"\n");
    }
    public void display()
    {
        System.out.println("The Shape is a Triangle.\n");
    }
}

class Circle implements DisplayShape{

    public void printArea() {
        int a;
        System.out.println("Area of a Circle:");
        System.out.print("Radius: ");
        a = sc.nextInt();
        System.out.println("Area of Circle is: "+(3.14*a*a)+"\n");
    }
    public void display()
    {
        System.out.println("The Shape is a Circle.\n");
    }
}

public class Shapes {

    public static void main(String[] args) {
        DisplayShape r = new Rectangle();
        DisplayShape t = new Triangle();
        DisplayShape c = new Circle();

        r.printArea();
        r.display();
        t.printArea();
        t.display();
        c.printArea();
        c.display();
    }
}
