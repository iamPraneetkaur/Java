// Problem Statement



// Arun has been assigned the task of writing a program that accepts user input for an Integer and a Character. The program should then use wrapper classes to convert these inputs into their corresponding primitive types (int, and char) and display the results.



// Your task is to help Arun complete his assignment.

// Input format :
// The first line of input consists of an integer value.

// The second line consists of a character.

// Output format :
// The first line of output displays the converted primitive integer value.

// The second line displays the converted primitive character value.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ integer ≤ 100000
// The character will be either uppercase or lowercase.

// Sample test cases :
// Input 1 :
// 23
// A
// Output 1 :
// Integer Value: 23
// Character Value: A
// You are using Java
import java.util.*;
public class input{
    public static void main(String[] args){
        char ch;
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        ch= sc.next().charAt(0);
        System.out.println("Integer Value: "+n);
        System.out.println("Character Value: "+ch);
    }
}