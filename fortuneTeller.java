import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);
        
    // Ask the user for the user’s first name.
    System.out.print("Enter your name: ");
    String firstName = customerInput.nextLine();
    System.out.println("The Customer's First Name is: "+firstName);

    // Ask the user for the user’s last name.
    System.out.print("Enter your last name: ");
    String lastName = customerInput.nextLine();
    System.out.println("The Customer's Last Name is: "+lastName);

    // Ask the user for the user’s age.
    System.out.print("Enter your Age: ");
    int age = customerInput.nextInt();
    System.out.println("The Customer is: "+age+" years old");

    // Ask the user for the user’s birth month (as an 'int').
    System.out.print("What is your birth month? (#): ");
    int birthMonth = customerInput.nextInt();
    System.out.println("The Customer's Birth month is: "+birthMonth);

    // Ask the user for the user’s favorite ROYGBIV color.
        //     If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
    System.out.print("what is your favorite ROYGBIV color?: ");
    String favColor = customerInput.nextLine();
    System.out.println("The Customer's Favorite color is: "+favColor);


    // Ask the user for the user's number of siblings.
    System.out.print("How many siblings do you have?: ");
    int siblings = customerInput.nextInt();
    System.out.println("The Customer has: "+siblings+" siblings");

    customerInput.close();
    }
}
