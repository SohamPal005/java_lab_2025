class Calculate {

    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }

    double subtract(int a, double b) {
        return a - b;
    }
}

class CalculateDemo{
    public static void main(String[] args)
    {
        Calculate calc = new Calculate();

        System.out.println("subtract(int, int): " + calc.subtract(10, 4));
        System.out.println("subtract(double, double): " + calc.subtract(10.5, 4.2));
        System.out.println("subtract(int, int, int): " + calc.subtract(20, 5, 3));
        System.out.println("subtract(int, double): " + calc.subtract(15, 4.5));
    }
}
