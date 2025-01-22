// public Problem Statement



// Pam, Jim, and Dwight are employees at a paper company, each earning a monthly salary. They want to calculate their total combined salary to manage their team expenses. 



// Your task is to write a program that compute the sum of their salaries and display the total amount. 

// Input format :
// The input consists of three double values, representing the monthly salaries of Pam, Jim, and Dwight, respectively.

// Output format :
// The output prints "Rs. X", where X is the combined salary, rounded off to two decimal places.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1000.0 ≤ monthly salary ≤ 1,00,000.0

// Sample test cases :
// Input 1 :
// 2500.75
// 3000.4
// 2700.98
// Output 1 :
// Rs. 8202.13
// Input 2 :
// 10075.00
// 15000.70
// 28085.6
// Output 2 :
// Rs. 53161.30

import java.util.*;
public class DecimalSum{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        double p, j, d, x;
        Scanner sc= new Scanner(System.in);
        p=sc.nextDouble();
        j= sc.nextDouble();
        d= sc.nextDouble();
        x= p+j+d;
        System.out.println("Rs. "+ String.format("%.2f", x));
    }
}