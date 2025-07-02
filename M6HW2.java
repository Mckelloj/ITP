import java.util.Scanner;

public class M6HW2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input homeowner's name
        System.out.print("Enter homeowner's name: ");
        String homeownerName = scanner.nextLine();

        // Input previous month's reading
        System.out.print("Enter previous month's meter reading: ");
        int previousReading = scanner.nextInt();

        // Input current month's reading
        System.out.print("Enter current month's meter reading: ");
        int currentReading = scanner.nextInt();

        // Calculate water usage
        int usage = currentReading - previousReading;

        // Calculate charges
        double baseFee = 50.0;
        double perGallonCharge = 0.20;
        double usageCharge = usage * perGallonCharge;
        double totalCharge = baseFee + usageCharge;

        // Display results
        System.out.println("Homeowner's Name: " + homeownerName);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Monthly Charge: $" + totalCharge);

        
        scanner.close();

    }
}
