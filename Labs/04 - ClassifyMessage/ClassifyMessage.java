// For an overview of the program and sample inputs, be sure to check out `ClassifyMessage.md`

import java.util.Scanner;

public class ClassifyMessage {
    enum MessageCategory {
        NEED,
        OFFER,
        ALERT,
        INFO,
        UNKNOWN
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Prompts the user to add their formatted message
        System.out.println("Please enter a formatted message: ");

        //Final declared variables, will not be changed once initialized
        final double south = 39.882343;
        final double north = 40.231315;
        final double west = -105.743511;
        final double east = -104.907864;

        //Declared variables
        String catString;
        String payload;
        double latitude;
        double longitude;
        boolean isInRange = false;

        MessageCategory category;

        //Various methods used to help read the message
        catString = input.next();
        latitude = input.nextDouble();
        longitude = input.nextDouble();
        payload = input.nextLine().trim();

        //Multi-branch if/else-if statement to add conditions when outputting from catString
        //Use equalsIgnoreCase() for every conditional, it is used to compare two strings ignoring case differences
        if (catString.equalsIgnoreCase("smoke") || catString.equalsIgnoreCase("fire")) {
            category = MessageCategory.ALERT;
        } else if (catString.equalsIgnoreCase("need")) {
            category = MessageCategory.NEED;
        } else if (catString.equalsIgnoreCase("offer")) {
            category = MessageCategory.OFFER;
        } else if (catString.equalsIgnoreCase("structure") || catString.equalsIgnoreCase("photo") || catString.equalsIgnoreCase("evac")) {
            category = MessageCategory.INFO;
        } else {
            category = MessageCategory.UNKNOWN;
        }

        //If/else-if statement to determine if latitude/longitude are within correct bounds
        if ((latitude >= south) && (latitude <= north) && (longitude >= west) && (longitude <= east)) {
            isInRange = true;
        } else {
            isInRange = false;
        }

        //Outputting variables and closing Scanner class
        System.out.println("Category:\t" + category);
        System.out.println("Raw Cat:\t" + catString);
        System.out.println("Message:\t" + payload);
        System.out.println("Latitude:\t" + latitude);
        System.out.println("Longitude:\t" + longitude);
        System.out.println("In Range:\t" + isInRange);
        input.close();
    }
}
