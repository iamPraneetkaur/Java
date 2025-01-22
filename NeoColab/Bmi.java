// Problem Statement



// John is a fitness trainer and needs to calculate the Body Mass Index (BMI) for his clients to assess their health status. Write a program for him that takes the weight in kilograms and height in meters of a client as input, calculates their BMI, and determines if they fall within the healthy range.



// Formula:

// BMI=Weight/Height*Height



// Note: The healthy range of BMI is 18.5 to 24.9 (both inclusive).

// Input format :
// The input consists of two double values, the weight in kilograms and the height in meters.

// Output format :
// The first line of output prints "BMI: X" where X is a double value, rounded off to two decimal places.

// The second line prints one of the following:

// If the BMI is within the valid range, print "Healthy Range".
// Otherwise, print "Not in Healthy Range".


// Refer to the sample output for formatting specifications

// Code constraints :
// The given test cases fall under the following constraints:

// 10.0 ≤ weight ≤ 300.0

// 0.00 ≤ height ≤ 3.00

// Sample test cases :
// Input 1 :
// 65.8
// 1.75
// Output 1 :
// BMI: 21.49
// Healthy Range
// Input 2 :
// 124.3
// 1.87
// Output 2 :
// BMI: 35.55
// Not in Healthy Range
import java.util.*;
public class Bmi{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        double weight, height, bmi;
        Scanner sc= new Scanner(System.in);
        weight= sc.nextDouble();
        height= sc.nextDouble();
        bmi= Math.round((weight/(height*height)*100.0))/100.0;
        System.out.println("BMI: "+bmi);
        if(bmi>=18.5 && bmi<=24.9){
            System.out.print("Healthy Range");
        }
        else{
            System.out.println("Not in Healthy Range");
        }
    }
}