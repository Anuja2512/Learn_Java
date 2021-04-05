import java.util.*;

class Shape{

    int shapeID, a, b;
    static String roxy = "Let's calculate the Area.";

    public Shape(int l, int b, int type)
    {
        this.a = l;
        this.b = b;
        if(type==1)
        {
            shapeID = 2;
        }
        if(type==2)
        {
            shapeID = 3;
        }
    }

    public Shape(int r)
    {
        shapeID = 1;
        this.a = r;
    }

    public static class GetMe{
        public void display()
        {
            System.out.println(roxy);
        }
    }

    public int getArea()
    {
        if(shapeID==1)
        {
            //circle
            return (int)3*a*a;
        }
        if(shapeID==2)
        {
            //rectangle
            return (int)(a*b);
        }
        if(shapeID==3)
        {
            //triangle
            return (int)((a*b)/2);
        }
        return 0;
    }
}

public class Demonstrate {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a Shape:\n1. Circle.\n2. Rectangle.\n3. Triangle.");
        System.out.print("Your Choice: ");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            int rad;
            System.out.print("Enter Radius: ");
            rad = sc.nextInt();
            Shape s = new Shape(rad);
            Shape.GetMe m = new Shape.GetMe();
            m.display();
            System.out.println("Area is: "+s.getArea());
        }
        if(choice == 2)
        {
            int l, b;
            System.out.print("Enter Length: ");
            l = sc.nextInt();
            System.out.print("Enter Breadth: ");
            b = sc.nextInt();
            Shape s = new Shape(l, b, 1);
            Shape.GetMe m = new Shape.GetMe();
            m.display();
            System.out.println("Area is: "+s.getArea());
        }
        if(choice == 3)
        {
            int l, b;
            System.out.print("Enter Base: ");
            l = sc.nextInt();
            System.out.print("Enter Height: ");
            b = sc.nextInt();
            Shape s = new Shape(l, b, 2);
            Shape.GetMe m = new Shape.GetMe();
            m.display();
            System.out.println("Area is: "+s.getArea());
        }
    }
}