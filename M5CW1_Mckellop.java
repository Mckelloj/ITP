import java.util.Scanner;

public class M5CW1_Mckellop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 1;

        // Prompt user to enter 5 numbers using a while loop
        while (count <= 5) 
        {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            sum += num;
            count++;
        }

        System.out.println("The sum of the 5 numbers is: " + sum);
        scanner.close();
    }
}