// Problem Statement



// Saran and Dinesh are preparing the release details for their new show 'Galactic Adventures' on their streaming service. To ensure the episode information is accurate, Saran asks Dinesh to create a program to input the episode number and its duration, and then display this information.



// Your task as a programmer is to assist them in this program.

// Input format :
// The input consists of an integer N, representing the episode number and a double value X, representing its duration.

// Output format :
// The output prints "Episode [N] is [X] hours long!"



// Refer to the sample output for the exact text and format.

// Code constraints :
// 1 ≤ N ≤ 10

// 0.1 ≤ X ≤ 12.0

// Sample test cases :
// Input 1 :
// 1 2.75
// Output 1 :
// Episode 1 is 2.75 hours long!
// Input 2 :
// 2 3.75
// Output 2 :
// Episode 2 is 3.75 hours long!
//Solution:
// You are using Java
import java.util.*;
public class StringInput{
    public static void main(String args[]){
        int ep;
        double h;
        Scanner sc= new Scanner(System.in);
        ep= sc.nextInt();
        h= sc.nextDouble();
        System.out.println("Episode "+ ep+ "is "+ h+ "hours long!");
    }
}