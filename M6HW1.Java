import java.util.Scanner;

public class M6HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee name
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        // Input pay rate
        System.out.print("Enter pay rate: ");
        double payRate = scanner.nextDouble();

        // Input hours worked
        System.out.print("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = payRate * hoursWorked;

        // Display results
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);

        scanner.close();
    }
}