import java.util.Scanner;

/**
 * M7HW1_Functions  starter file
 */

public class M7HW1_Functions 
{

    public static void main(String[] args) 
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner in = new Scanner(System.in);
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
        {
            displayInfo();

            // Call all functions in order
            double sales = getSales(in);
            double returns = getReturns(in);
            double totalSold = calWidSold(sales, returns);
            double salesAmount = calWidSalesAmt(totalSold);
            double commission = calComm(salesAmount);
            double monthlySalary = calSalary(commission);

            displayValues(sales, returns, totalSold, salesAmount, commission, monthlySalary);

            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }

        in.close();
        System.out.println("Program has terminated!");
    }

    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Joshua Mckellop");
        System.out.println();
        System.out.println("Multi-Function Code");
        System.out.println();
        

    }
    // create your functions/methods here
    public static double getSales(Scanner in)
    {
        System.out.print("Enter weekly sales: ");
        double sales = in.nextDouble();
        return sales;
    }
    
    public static double getReturns(Scanner in)
    {
        System.out.print("Enter weekly returns: ");
        double returns = in.nextDouble();
        return returns;
    }
    
    public static double calWidSold(double sales, double returns)
    {
        double totalSold = sales - returns;
        return totalSold;
    }
    
    public static double calWidSalesAmt(double totalSold)
    {
        final double WIDGET_PRICE = 4.79; // You can adjust this value if needed
        double salesAmount = totalSold * WIDGET_PRICE;
        return salesAmount;
    }
    
    public static double calComm(double totalWidgetSalesAmt)
    {
        // Example commission rate: 10%
        final double COMM_RATE = 0.10;
        double commission = totalWidgetSalesAmt * COMM_RATE;
        return commission;
    }
    
    public static double calSalary(double commission)
    {
        final double BASE_SALARY = 2000.0;
        double monthlySalary = BASE_SALARY + commission;
        return monthlySalary;
    }
    
    public static void displayValues(double sales, double returns, double totalSold, double salesAmount, double commission, double monthlySalary)
    {
        System.out.println("----- Results -----");
        System.out.println("Weekly Sales: " + sales);
        System.out.println("Weekly Returns: " + returns);
        System.out.println("Total Widgets Sold: " + totalSold);
        System.out.println("Total Widget Sales Amount: $" + salesAmount);
        System.out.println("Commission Amount: $" + commission);
        System.out.println("Monthly Salary: $" + monthlySalary);
        System.out.println("-------------------");
    }
}