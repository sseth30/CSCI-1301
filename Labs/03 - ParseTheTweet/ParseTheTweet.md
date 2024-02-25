# `ParseTheTweet.java` Program

>[!IMPORTANT]
The `ParseTheTweet.java` Java program is designed to extract and process specific information from a tweet input by the user. The program focuses on tweets that include structured hashtags marking different types of information such as the type of event, details about the event, location, latitude, and longitude.

## How It Works

Upon execution, the program prompts the user to enter a tweet that follows a specific format with hashtags indicating different pieces of information:
- `#typ` for the type of event
- `#det` for details about the event
- `#loc` for the location of the event
- `#lat` for the latitude coordinate
- `#lng` for the longitude coordinate

Each piece of information is expected to be terminated with a semicolon (`;`).

## Example -
- Enter a tweet below
- `#typ offer; #det free essential supplies 4 evacs pets.; #loc
2323 55th st, boulder; #lat 40.022; #lng -105.226;`
>- Type: **OFFER**
>- Detail: **free essential supplies 4 evacs pets.** 
>- Location: **2323 55th st- boulder** 
>- Latitude: **40.022** 
>- Longitude: **-105.226** 

## Conclusion

`ParseTheTweet.java` is a straightforward Java application that demonstrates basic string manipulation techniques, such as substring extraction and character replacement, to parse structured information from social media posts.

