public class CommandLine {
    public static void main(String[] args)
    {
        int odd = 0;
        int even = 0;

        for(int i = 0; i < args.length; i++)
        {
            if(Integer.parseInt(args[i]) % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Number of odd numbers: " + odd);
        System.out.println("Number of even numebrs: " + even);
    }
}
