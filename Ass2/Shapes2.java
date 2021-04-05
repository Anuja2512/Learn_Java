import java.util.*;
 
abstract class Shape2{
    int a, b;
    Scanner sc= new Scanner(System.in);
    abstract void printArea();
}
 
class Rectangle2 extends Shape2{
 
    void printArea() {
        System.out.println("Area of a Rectangle:");
        System.out.print("Length: ");
        a = sc.nextInt();
        System.out.print("Breadth: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle is: "+a*b+"\n");
    }
}
 
class Triangle2 extends Shape2{
 
    void printArea() {
        System.out.println("Area of a Triangle:");
        System.out.print("Base: ");
        a = sc.nextInt();
        System.out.print("Height: ");
        b = sc.nextInt();
        System.out.println("Area of Triangle is: "+((a*b)/2)+"\n");
    }
}
 
class Circle2 extends Shape2{
    
    void printArea() {
        System.out.println("Area of a Circle:");
        System.out.print("Radius: ");
        a = sc.nextInt();
        System.out.println("Area of Circle is: "+(3.14*a*a)+"\n");
    }
}
 
public class Shapes2 {
 
    public static void main(String[] args) {
        Shape2 r = new Rectangle2();
        Shape2 t = new Triangle2();
        Shape2 c = new Circle2();
 
        r.printArea();
        t.printArea();
        c.printArea();
    }
}
