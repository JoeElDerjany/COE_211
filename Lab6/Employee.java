import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        Scanner scanEmp = new Scanner(System.in);
        System.out.println("Please input the employee’s first name: ");
        firstName = scanEmp.nextLine();
        System.out.println("Please input the employee’s last name: ");
        lastName = scanEmp.nextLine();
        System.out.println("Please input the employee’s age: ");
        age = scanEmp.nextInt();
        System.out.println("Please input the employee’s salary: ");
        salary = scanEmp.nextDouble();
    }


    public String toString() {
        return "Employee information: " + firstName + " " + lastName + ", " +  age + ", " + salary;
    }
}