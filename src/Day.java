import java.util.Scanner;

public class Day {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day no: ");
        int input = sc.nextInt();

        int day = input % 7;
        switch(day)
        {
            case 0:
                System.out.println(input + " is Sunday");
                break;
            case 1:
                System.out.println(input + " is Monday");
                break;
            case 2:
                System.out.println(input + " is Tuesday");
                break;
            case 3:
                System.out.println(input + " is Wednesday");
                break;
            case 4:
                System.out.println(input + " is Thursday");
                break;
            case 5:
                System.out.println(input + " is Friday");
                break;
            case 6:
                System.out.println(input + " is Saturday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
