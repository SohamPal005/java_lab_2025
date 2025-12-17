import java.util.Scanner;

public class Rect {
    int length;
    int breadth;

    Rect() {
        length = 0;
        breadth = 0;
    }

    Rect(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        return length * breadth;
    }
}

class RectDemo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Rect r1 = new Rect();
        System.out.println("Area with default constructor: " + r1.area());

        System.out.print("Enter length: ");
        int len = sc.nextInt();

        System.out.print("Enter breadth: ");
        int br = sc.nextInt();

        Rect r2 = new Rect(len, br);
        System.out.println("Area with given length and breadth: " + r2.area());
    }
}
