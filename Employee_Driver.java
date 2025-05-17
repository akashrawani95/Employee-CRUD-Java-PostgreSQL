package Employee_CRUD;

import java.util.Scanner;

public class Employee_Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee_Service service = new Employee_Service();

        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("Enter 1 to add Employee data");
        System.out.println("Enter 5 to exit");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {
            case 1:
                Employee emp = new Employee();
                System.out.print("Enter ID: ");
                emp.setId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Name: ");
                emp.setName(sc.nextLine());

                System.out.print("Enter Age: ");
                emp.setAge(sc.nextInt());

                System.out.print("Enter Salary: ");
                emp.setSalary(sc.nextDouble());

                service.insertEmployee(emp);
                break;
            case 5:
                System.out.println("Exiting application.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
