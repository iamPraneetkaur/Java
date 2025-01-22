// Problem Statement



// Zara and Mike are comparing their savings to decide their next move. If Zara's savings are greater than Mike's, they plan to calculate the difference; otherwise, they'll add both savings together. She wants to write a program to compute the result of this comparison and multiply it by 2, considering operator precedence.
// Help them in the programming task.

// Input format :
// The input consists of two integers a and b, representing Zara's and Mike's savings.

// Output format :
// The output prints the calculated result.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ a, b ≤ 1000

// Sample test cases :
// Input 1 :
// 100 250
// Output 1 :
// Result of (100 > 250 ? 100 - 250 : 100 +250) * 2: 700
// Input 2 :
// 20 15
// Output 2 :
// Result of (20 > 15 ? 20 - 1
import java.util.*;
public class TernaryOperator{
    // You are using Java
    public static void main(String[] args) {
        //Type your code here
        int a,b;
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        System.out.println("Result of ("+a+" > "+b+" ? "+a+" - "+b+": "+a+" +"+b+") * 2: "+((a>b?a-b: a+b)*2));
        
    }
}