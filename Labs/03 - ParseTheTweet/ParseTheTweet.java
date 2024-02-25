// For an overview of the program and sample inputs, be sure to check out `ParseTheTweet.md`

import java.util.Scanner;

public class ParseTheTweet {
    public static void main(String[] args) {

        //Tweet's input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a tweet below ");
        String tweet = scan.nextLine();
        scan.close();

        //Tweet parsing to specific data hashtags
        String type = tweet.trim().substring(tweet.indexOf("#typ") + 5, tweet.indexOf(";")).toUpperCase();
        String detail = tweet.trim().substring(tweet.indexOf("#det") + 5, tweet.indexOf("; #loc")).replace(",", "-");
        String location = tweet.trim().substring(tweet.indexOf("#loc") + 5, tweet.indexOf("; #lat")).replace(",", "-");
        String latitude = tweet.trim().substring(tweet.indexOf("#lat") + 5, tweet.indexOf("; #lng"));
        String longitude = tweet.trim().substring(tweet.indexOf("#lng") + 5, tweet.length() - 2);

        //Tweet's outputs
        System.out.println("Type: \t\t" + type);
        System.out.println("Detail: \t" + detail);
        System.out.println("Location: \t" + location);
        System.out.println("Latitude: \t" + latitude);
        System.out.println("Longitude: \t" + longitude);

    }
}
