import java.util.Scanner;

public class Grade {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade: ");
        int grade = sc.nextInt();

        if(grade >= 90)
            System.out.println("Your grade is O");
        else if(grade >= 80)
            System.out.println("Your grade is E");
        else if(grade >= 70)
            System.out.println("Your grade is A");
        else if(grade >= 60)
            System.out.println("Your grade is B");
        else if(grade >= 50)
            System.out.println("Your grade is C");
        else if(grade >= 40)
            System.out.println("Your grade is D");
        else
            System.out.println("Your grade is F");
    }
}
