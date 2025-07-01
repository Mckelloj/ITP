// Group project starter file 
import java.util.Scanner; 
class M6Project_LastName // change the lastName to your LastName 
{ 
public static void main(String[] args)  
{ 
    runProgram(); 
} 

    public static void runProgram() 
    { 
        System.out.println("Method Project"); 
        Scanner in = new Scanner ( System.in ); 
        String keep_going = "yes"; 
        while(keep_going.equalsIgnoreCase("yes")) 
        { 
            displayMenu(); 
        } 

        System.out.println(); 
        System.out.print("Do you want to run the program again? Enter yes or no: "); 
        keep_going = in.next(); 
        System.out.println(); 
        System.out.println("Program has terminated!"); 

    } 

    public static void displayMenu() 
    { 
        System.out.println();  
        System.out.println("Menu"); 
        System.out.println(); 
// give your programs better names 
        System.out.println("1) M6HW1: "); 
        System.out.println("2) M6HW2: "); 
        System.out.println("3) M6HW3: "); 
        System.out.println("4) Exit: "); 
        System.out.println(); 
        System.out.print ( "Selection: " ); 
        Scanner in = new Scanner ( System.in ); 
// change the cases below to better reflect the programs you are running 
       
        switch ( in.nextInt() )  
        { 
            case 1: 
            getM6HW1(); 
            displayMenu(); 
            break; 
             
            case 2: 
            System.out.println(""); 
            System.out.println ( "You picked M6HW2" ); 
            System.out.println ( "" ); 
            displayMenu(); 
            break; 

            case 3: 
            System.out.println(""); 
            System.out.println ( "You picked M6HW3" ); 
            System.out.println ( "" ); 
            displayMenu(); 
            break; 

            case 4: 
            System.out.println(""); 
            System.out.println ( "Exiting the program" ); 
            break; 

            default: 
            System.out.println("");      
            System.out.println ( "Unrecognized option..Try again" ); 
            System.out.println(""); 
            displayMenu(); 
            break; 
        } 
    }  



// new methods containg the other programs should go here 
// I completed the first method structure for you 
// the 2nd and third method structure will follow the same pattern 
// just copy and paste the code 
// You will need to add your code from M6HW1 in the method 

    public static void getM6HW1() 
    { 
        System.out.println(""); 
        System.out.println(""); 
        System.out.println ( "You picked M6HW1" ); 
        System.out.println ( "" ); 
        // add your code here for M6HW1
    } 
} 
