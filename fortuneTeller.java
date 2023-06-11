import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;
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


// retirement years
// 	based off users age
// odd   20
// even  35
public static int getYearsToRetirement(Scanner input, int age) {
    int yearsToRetirement = 0;
    if(age % 2 == 0){
        yearsToRetirement = 20;
    }else{
        yearsToRetirement = 35;
    }
    return yearsToRetirement;
}



// Vacation home location
// 	based off of siblings user has
// 0     Gatlinburg, Tn
// 1     Disney Land
// 2     Japan
// 3     Greenland
// >3    Paris France
// <0    North Korea
public static String getVacationHomeLocation(Scanner input, int siblings) {
    String vacationHomeLocation = "";
    if(siblings == 0){
        vacationHomeLocation = "Gatlinburg, Tn";
    }else if(siblings == 1){
        vacationHomeLocation = "Disney Land";
    }else if(siblings == 2){
        vacationHomeLocation = "Japan";
    }else if(siblings == 3){
        vacationHomeLocation = "Greenland";
    }else if(siblings > 3){
        vacationHomeLocation = "Paris France";
    }else{
        vacationHomeLocation = "North Korea";
    }
    return vacationHomeLocation;
}

// Mode of Transpertation
// 	based off of user fav color
// red      6 Speed Mountain Bike
// orange   Harley Davidson Motorcycle
// yellow   New York Taxi Cab
// green    VolkWagon Electric Van
// blue     Tesla
// indigo   PT Cruiser
// violet   Struck by lightning while in a laboratory, you now have access to the speed force!

public static String getModeOfTransportation(Scanner input, String favColor){
    String modeOfTransportation = "";
    switch (favColor.toLowerCase()){
        case "red":
            modeOfTransportation = "6 Speed Mountain Bike";
            break;
        case "orange":
            modeOfTransportation = "Harley Davidson Motorcycle";
            break;
        case "yellow":
            modeOfTransportation = "New York Taxi Cab";
            break;
        case "green":
            modeOfTransportation = "VolkWagon Electric Van";
            break;
        case "blue":
            modeOfTransportation = "Tesla";
            break;
        case "indigo":
            modeOfTransportation = "PT Cruiser";
            break;
        case "violet":
            modeOfTransportation = "Struck by lightning while in a laboratory, you now have access to the speed force";
            break;
        default:
            modeOfTransportation = "Chuck Taylors";
    }
    return modeOfTransportation;
}

// Bank Balance
// 	based of users birth month

// 1-3        $800
// 4-6        $67,000
// 7-9        $5,000,000
// 10-12      $3.09
// <1 || >12  0.00
public static double getBankBalance(int birthMonth){
    double bankBalance = 0.0;
    if(birthMonth > 0 && birthMonth <= 3){
        bankBalance = 800;
    }else if (birthMonth > 3 && birthMonth <= 6){
        bankBalance = 7000;
    }else if (birthMonth > 6 && birthMonth <= 9){
        bankBalance = 5000000;
    }else if (birthMonth > 9 && birthMonth <= 12){
        bankBalance = 3.09;
    }
    return bankBalance;
}


//Display the user's fortune in this format
//[First Name] [Last Name] will retire in [# of years] with [bank balance] in the bank, a vacation home in [location], and travel by [mode of transportation].
// firstName  lastName  yearsToRetirement   bankBalance    vacationHomeLocation   modeOfTransportation
    System.out.println("Hello World");


}