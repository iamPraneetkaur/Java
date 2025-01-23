package Unit1;
// Problem Statement



// Alex and Pat recently completed a coding competition and want to evaluate their performance. They decide to calculate their average score to understand how well they performed as a team. 

// Write a program that takes Alex’s and Pat’s individual scores as input and computes the average of their scores.

// Input format :
// The input consists of two double values, representing Alex’s and Pat’s individual scores.

// Output format :
// The output prints the average score of Alex and Pat, rounded off to two decimal places.



// Refer to the sample output for format specification.

// Code constraints :
// The given test cases fall under the following constraints:

// 1.0 ≤ score ≤ 100.0

// Sample test cases :
// Input 1 :
// 85.5
// 92.67
// Output 1 :
// 89.09
// Input 2 :
// 60.50
// 75.5
// Output 2 :
// 68.00

import java.util.*;
public class DoubleAverage{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        double alex, pat;
        Scanner sc= new Scanner(System.in);
        alex= sc.nextDouble();
        pat= sc.nextDouble();
        System.out.println(String.format("%.2f", (alex+pat)/2.00));
    }
}