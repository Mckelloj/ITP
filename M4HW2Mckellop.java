// Joshua Mckellop
// M4HW1
// June 15, 2025
// This program checks voter eligibility in North Carolina.

import java.util.Scanner;

public class M4HW2Mckellop 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a US citizen? ");
        String isCitizen = scanner.nextLine();

        if (!isCitizen.equalsIgnoreCase("yes")) {
            System.out.println("You cannot vote because you are not a US citizen.");
        } else {
            System.out.print("Have you lived in your county for at least 30 days? ");
            String isResident = scanner.nextLine();

            if (!isResident.equalsIgnoreCase("yes")) {
                System.out.println("You cannot vote because you have not lived in your county for at least 30 days.");
            } else {
                System.out.print("Will you be at least 18 years old by the general election? ");
                String isEighteen = scanner.nextLine();

                if (!isEighteen.equalsIgnoreCase("yes")) {
                    System.out.println("You cannot vote because you are not at least 18 years old by the date of the general election.");
                } else {
                    System.out.print("Are you currently serving a felony sentence or on probation? ");
                    String isFelon = scanner.nextLine();

                    if (isFelon.equalsIgnoreCase("yes")) {
                        System.out.println("You cannot vote because you are serving a felony sentence or on probation.");
                    } else {
                        System.out.println("You are eligible to vote in North Carolina.");
                    }
                }
            }
        }

        scanner.close();
    }
}