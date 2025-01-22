// Problem Statement



// Imagine you are tasked with developing a program to calculate the simple interest on a principal amount based on user inputs. 



// The program should take three inputs from the user: principal, rate, and time. It should then calculate the simple interest using the formula (principal * rate * time) / 100. Also, calculate the total amount (principal + simple interest) and display both the results.



// It is important to consider the operator precedence and order of evaluation in this calculation.

// Input format :
// The first line of input consists of an integer, representing the principal amount.

// The second line consists of a float value, representing the rate of interest.

// The third line consists of an integer, representing the time (in years).

// Output format :
// The first line of output prints a float value, representing the simple interest, rounded off to two decimal places.

// The second line prints a float value, representing the total amount, rounded off to two decimal places.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ principal amount ≤ 100000

// 1.1 ≤ rate ≤ 12.0

// 1 ≤ time ≤ 10

// Sample test cases :
// Input 1 :
// 600
// 2.7
// 2
// Output 1 :
// Simple Interest: 32.40
// Total Amount: 632.40
// Input 2 :
// 1000
// 1.58
// 8
// Output 2 :
// Simple Interest: 126.40
// Total Amount: 1126.40

import java.util.*;
public class SimpleInterest{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        int p, t;
        float r, i, a;
        Scanner sc= new Scanner(System.in);
        p= sc.nextInt();
        r= sc.nextFloat();
        t= sc.nextInt();
        i= (p*r*t)/100.0f;
        a= p+i;
        System.out.println("Simple Interest: "+String.format("%.2f", i));
        System.out.println("Total Amount: "+ String.format("%.2f", a));
    }
}