import java.util.Scanner;

public class M6HW3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input employee name
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        // Input widgets sold
        System.out.print("Enter number of widgets sold: ");
        int widgetsSold = scanner.nextInt();

        // Input widgets returned
        System.out.print("Enter number of widgets returned: ");
        int widgetsReturned = scanner.nextInt();

        // Calculate net widgets sold
        int netWidgetsSold = widgetsSold - widgetsReturned;

        // Calculate commission and total pay
        double baseSalary = 500.0;
        double commissionPerWidget = 0.10;
        double commission = netWidgetsSold * commissionPerWidget;
        double totalPay = baseSalary + commission;

        // Display results
        System.out.println("\nEmployee Name: " + employeeName);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.println("Total Pay (Base + Commission): $" + totalPay);

        scanner.close();
        
    }
}
