import java.util.Scanner;

public class Rectangle {
    double length;
    double breadth;

    Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double area()
    {
        return length * breadth;
    }

    double perimeter()
    {
        return 2 * (length + breadth);
    }
}

class RectangleDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        Rectangle rt = new Rectangle(length, breadth);
        System.out.println("\n\nArea of rectangle: " + rt.area());
        System.out.println("Perimeter of rectangle: " + rt.perimeter());
    }
}
