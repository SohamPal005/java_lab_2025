import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String check = sc.nextLine();
        int palindrome = 1;

        for(int i = 0; i < check.length(); i++)
        {
            if(check.charAt(i) != check.charAt(check.length() - i - 1))
            {
                System.out.println("The string is NOT a palindrome");
                palindrome = 0;
                break;
            }
        }

        if(palindrome == 1)
            System.out.println("The string is a palindrome");
    }
}
