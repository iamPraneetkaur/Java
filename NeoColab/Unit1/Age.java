package Unit1;
// Problem Statement



// Meet Sarah, a healthcare professional, who is developing a program to classify individuals into age groups and provide health advice based on their age and chronic disease status. The program prompts the user for their age and classifies them as a Child, Teenager, Adult, or Senior.



// Note: Individuals between ages 0-12 are 'Child', 13-19 are 'Teenager', 20-64 are 'Adult' and greater than 65 are 'Senior'.

// Input format :
// The input consists of an integer, representing the age.

// Output format :
// The output should display the age group to which the user belongs ("Child", "Teenage", "Adult", "Senior").

// If the age is negative, print "Invalid age".



// Refer to the sample output for formatting specifications.

// Sample test cases :
// Input 1 :
// 78
// Output 1 :
// Senior
// Input 2 :
// 12
// Output 2 :
// Child
// Input 3 :
// 24
// Output 3 :
// Adult
// Input 4 :
// 16
// Output 4 :
// Teenager
// Input 5 :
// -8
// Output 5 :
// Invalid age

import java.util.*;
public class Age{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        int age;
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        if(age<0)
            System.out.println("Invalid age");
        else if(age>=0 && age <=12)
            System.out.println("Child");
        else if(age>12 && age<20)
            System.out.println("Teenager");
        else if(age>19 && age<65)
            System.out.println("Adult");
        else
            System.out.println("Senior");
    }
}