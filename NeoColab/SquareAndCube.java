// Problem Statement



// Arjun wants to calculate the square and cube of a number for his math project. 

// Write a program where the user inputs a single integer. The program should compute the square and cube of the number and display them.

// Input format :
// The input consists of a single integer n.

// Output format :
// The output prints the square and cube of the input number as:

// "Square of <<n>> 5 is <<square>>"

// "Cube of <<n>> is <<cube>"



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 100

// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// Square of 5 is 25
// Cube of 5 is 125
// Input 2 :
// 39
// Output 2 :
// Square of 39 is 1521
// Cube of 39 is 59319

// You are using Java
import java.util.*;
public class SquareAndCube{
    public static void main(String args[]) {
        //Type your code here
        int n, sq, cb;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        sq= n*n;
        cb= n*n*n;
        System.out.println("Square of "+n+" is "+sq+"\nCube of "+n+" is "+cb);
    }
}