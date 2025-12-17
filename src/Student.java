import java.util.Scanner;

class Student {
    int rollno;
    String name;
    double cgpa;

    Student(int rollno, String name, double cgpa)
    {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    void display()
    {
        System.out.println("Roll no: " + rollno + "Name: " + name + "CGPA: " + cgpa);
    }
}

class StudentDemo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.print("Roll: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();
            sc.nextLine();

            s[i] = new Student(roll, name, cgpa);
        }

        System.out.println("\nDetails of students:");
        for (int i = 0; i < n; i++)
        {
            s[i].display();
        }

        double minCgpa = s[0].cgpa;
        int minIndex = 0;
        for (int i = 1; i < n; i++)
        {
            if (s[i].cgpa < minCgpa)
            {
                minCgpa = s[i].cgpa;
                minIndex = i;
            }
        }

        System.out.println("\nStudent with lowest CGPA:");
        System.out.println("Name: " + s[minIndex].name + ", CGPA: " + s[minIndex].cgpa);
    }
}