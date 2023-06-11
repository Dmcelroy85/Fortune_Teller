import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args) {
        Scanner customerInput = new Scanner(System.in);

    System.out.println("Welcome! Would you like your fortune told?");
    System.out.println("Just answer a few of my questions, and I'll unfold your future");
        
    // Ask the user for the user’s first name.
    System.out.print("Enter your name: ");
    String firstName = customerInput.nextLine();

    // Ask the user for the user’s last name.
    System.out.print("Enter your last name: ");
    String lastName = customerInput.nextLine();

    // Ask the user for the user’s favorite ROYGBIV color.
    // If the user does not know what ROYGBIV is, ask the user to enter “Help” to get a list of the ROYGBIV colors.
    System.out.print("What is your favorite ROYGBIV color, type HELP if you don't know their colors:: ");
    String favColor = customerInput.nextLine();
    if(favColor.equalsIgnoreCase("Help")); {
        System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, Violet");
        favColor = customerInput.nextLine();
    }

    // Ask the user for the user’s age. (as an it)
    System.out.print("Enter your Age: ");
    int age = customerInput.nextInt();

    // Ask the user for the user’s birth month (as an 'int').
    System.out.print("What is your birth month? (#): ");
    int birthMonth = customerInput.nextInt();


    // Ask the user for the user's number of siblings. (as and int)
    System.out.print("How many siblings do you have?: ");
    int siblings = customerInput.nextInt();

    //Recall all of the information that has been gathered
    System.out.println("Hmmm... Hmmm.. so your name is "+firstName+" "+lastName+", you're "+age+", your birth month is "+birthMonth+". You also have "+siblings+" siblings, and your favorite color is "+favColor);

    customerInput.close();
    }
}

// retirement years
// 	based off users age

// odd   20
// even  35



// Vacation home location
// 	based off of siblings user has

// 0     Gatlinburg, Tn
// 1     Disney Land
// 2     Japan
// 3     Greenland
// >3    Paris France
// <0    North Korea


// Mode of Transpertation
// 	based off of user fav color

// red      6 Speed Mountain Bike
// orange   Harley Davidson Motorcycle
// yellow   New York Taxi Cab
// green    VolkWagon Electric Van
// blue     Tesla
// indigo   PT Cruiser
// violet   Struck by lightning while in a laboratory, you now have access to the speed force!


// Bank Balance
// 	based of users birth month

// 1-3        $800
// 4-6        $67,000
// 7-9        $5,000,000
// 10-12      $3.09
// <1 || >12  0.00