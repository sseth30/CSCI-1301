# `ClassifyMessage.java` Program 

>[!IMPORTANT]
The `ClassifyMessage.java` Java program is designed to classify and process emergency-related messages based on predefined categories. It uses an enumerated type for message categories and determines the message's category and whether the specified location is within a certain range.

## Program Description

The program starts by prompting the user to input a formatted message, which includes several message categories. It then classifies the message into one of the following categories based on the category tag, identifying a variety of key information such as:

- `Category`
- `Raw Cat (Category)`
- `Message`
- `Latitude`
- `Longitude`
- `In Range`

The program also checks if the given latitude and longitude are within a predefined geographical area.

## Key Features

- **Category Classification:** Classifies messages into specific categories based on keywords.
- **Geographical Range Checking:** Determines if the message's location falls within a specified geographical area.
- **User Interaction:** Prompts the user for a formatted message input and displays the classified information.

## Example -
- **Please enter a formatted message:**
- ```java
  need 40.011471 -105.28638 volunteers sun 8a-10p donation ctr 2 help w/donations for victims & firefighters: 3111 28th st
>- Category: **NEED**
>- Raw Cat: **need** 
>- Message: **volunteers sun 8a-10p donation ctr 2 help w/donations for victims & firefighters: 3111 28th st** 
>- Latitude: **40.011471** 
>- Longitude: **-105.28638** 
>- In Range: **true**

