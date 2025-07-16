import java.util.Scanner;
public class Final_Exam 
{
    public static void runProgram(String[] args) 
    {
        Scanner in = new Scanner (System.in);

        displayInfo();
        getItemCount(in);
    }

    public static void displayInfo()
    {
        System.out.println("Joshua Mckellop");
        System.out.println("2025 Spring CIS 115 Final Exam");
        System.out.println("I did not use AI to help me with this final");
        System.out.println("I used only concepts covered in class");
    }

    public static int getItemCount(Scanner in)
    {
        
        System.out.println("How many items are there? Enter a number: ");
        int itemCount = in.nextInt();

        return itemCount;
    }
}
