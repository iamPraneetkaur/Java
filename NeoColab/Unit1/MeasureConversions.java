package Unit1;
// Problem statement

// ﻿

// Three travel enthusiasts, Emily, James, and Olivia, set off on a worldwide expedition. During their journey, they encounter different units of measurement. Emily wants to convert lengths (Choice 1: Inches to Centimeters), James seeks to convert weights (Choice 2: Pounds to Kilograms), and Olivia is interested in volume conversions (Choice 3: Gallons to Liters). To facilitate their travels, write a Java program that allows them to select their preferred conversion type and see the result in the desired units, accurately representing their diverse needs for their international exploration.



// Formula for conversion

// centimeters = inches * 2.54
// kilograms = pounds * 0.453592
// liters = gallons * 3.78541
// Input format :
// The first line of input contains an integer representing the choice.

// the second line of input contains the decimal value, representing the unit to be converted in double type.

// Output format :
// The output will display the converted unit based on the provided input.



// Refer to the sample outputs for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ unit ≤ 100

// Choices = 1,2, and 3

// Sample test cases :
// Input 1 :
// 1
// 5
// Output 1 :
// 5.00 inches is equal to 12.70 centimeters.
// Input 2 :
// 2
// 8.6
// Output 2 :
// 8.60 pounds is equal to 3.90 kilograms.
// Input 3 :
// 3
// 12
// Output 3 :
// 12.00 gallons is equal to 45.

import java.util.*;
public class MeasureConversions{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        int n;
        double val;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        val= sc.nextDouble();
        switch(n){
            case 1:
                double cm= val*2.54;
                System.out.println(String.format("%.2f",val)+" inches is equal to "+String.format("%.2f", cm)+" centimeters.");
                break;
            case 2:
                double kg= val* 0.453592;
                System.out.println(String.format("%.2f", val)+" pounds is equal to "+String.format("%.2f", kg)+" kilograms.");
                break;
            case 3:
                double l= val*3.78541;
                System.out.println(String.format("%.2f", val)+" gallons is equal to "+String.format("%.2f", l)+" litres.");
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}