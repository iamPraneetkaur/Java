// Problem Statement



// Ella, a Netflix admin, is tasked with sending friendly renewal reminders to subscribers. She needs a program that prompts the user to input the subscriber's name and renewal date. Once the information is provided, the program should generate and display a personalized reminder message. 



// This will help ensure subscribers are aware of their upcoming renewal dates and can manage their subscriptions effectively.

// Input format :
// The input consists of a subscriber's name and renewal date as strings.

// Output format :
// The output prints the reminder message.



// Refer to the sample output for the exact text and format.

// Code constraints :
// The renewal date is a string in the format "YYYY-MM-DD".

// Sample test cases :
// Input 1 :
// Alice
// 2024-08-15
// Output 1 :
// Hi Alice,
// Just a reminder: Your next renewal is on 2024-08-15.
// Don't forget to renew!
// Input 2 :
// Shraddha
// 2024-09-21
// Output 2 :
// Hi Shraddha,
// Just a reminder: Your next renewal is on 2024-09-21.
// Don't forget to renew!
//Solution:
// You are using Java
import java.util.*;
public class NameAndDate{
    public static void main(String args[]){
        String name, date;
        Scanner sc= new Scanner(System.in);
        name= sc.nextLine();
        date= sc.nextLine();
        System.out.println("Hi "+name+",\nJust a reminder: Your next renewal is on "+date+".\nDon't forget to renew!");
    }
}