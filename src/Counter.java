import java.util.Scanner;

public class Counter {
    static int count;
    Counter()
    {
        count++;
    }

    static void showCount()
    {
        System.out.println("No. of objects created = " + count);
    }
}

class CounterDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many objects to create: ");
        int obj = sc.nextInt();

        for(int i = 0; i < obj; i++)
        {
            new Counter();
        }
        Counter.showCount();
    }
}
