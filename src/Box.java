import java.util.Scanner;

public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double volume()
    {
        return length * width * height;
    }
}

class BoxDemo{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of box: ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of box: ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of box: ");
        double height = sc.nextDouble();

        Box test = new Box(length, width, height);
        System.out.println("\n\nVolume of the box is: " + test.volume());
    }
}
