import java.util.Scanner;

public class M4HW1_Joshua_Mckellop {
    public static void main(String[] args) {
        // Constants
        final double WIDGET_PRICE = 4.79;
        final double BASE_SALARY = 2000.0;

        // Variables
        String salespersonName;
        int widgetsSold, widgetsReturned, netWidgetsSold;
        double widgetSalesAmount, commissionRate, commissionAmount, monthlySalary;

        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter salesperson's name: ");
        salespersonName = scanner.nextLine();

        System.out.print("Enter number of widgets sold: ");
        widgetsSold = scanner.nextInt();

        System.out.print("Enter number of widgets returned: ");
        widgetsReturned = scanner.nextInt();

        // Calculations
        netWidgetsSold = widgetsSold - widgetsReturned;
        widgetSalesAmount = netWidgetsSold * WIDGET_PRICE;

        // Determine commission rate
        if (netWidgetsSold >= 0 && netWidgetsSold <= 100) {
            commissionRate = 0.10;
        } else if (netWidgetsSold >= 101 && netWidgetsSold <= 199) {
            commissionRate = 0.15;
        } else if (netWidgetsSold >= 200 && netWidgetsSold <= 299) {
            commissionRate = 0.20;
        } else if (netWidgetsSold >= 300) {
            commissionRate = 0.25;
        } else {
            commissionRate = 0.0; // In case of negative net sales
        }

        commissionAmount = commissionRate * widgetSalesAmount;
        monthlySalary = BASE_SALARY + commissionAmount;

        // Output
        System.out.println("\nSalesperson Name: " + salespersonName);
        System.out.println("Net Widgets Sold: " + netWidgetsSold);
        System.out.printf("Widget Sales Amount: $%.2f%n", widgetSalesAmount);
        System.out.printf("Commission Amount: $%.2f%n", commissionAmount);
        System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);

        scanner.close();
    }
}