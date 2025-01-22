// Problem Statement



// Sarah, a student studying coordinate geometry, needs a program to calculate the slope, distance, and midpoint of line segments. She wants to understand how to work with Cartesian coordinates. Write a program to allow her to choose an operation and calculate the desired property based on two points.



// Formulas:

// slope = (y2 - y1) / (x2 - x1)

// distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))

// midpointX = (x1 + x2) / 2

// midpointY = (y1 + y2) / 2

// Input format :
// The first line of input contains an integer representing choices (1 for slope, 2 for distance, 3 for midpoint).

// The next line contains double values x1,y1,x2, y2 representing the coordinates.

// Output format :
// The output displays,

// For the slope operation, it prints the slope value.

// For the distance operation, it prints the distance between the two points.

// For the midpoint operation, it prints the coordinates of the midpoint (x, y).



// Refer to the sample output for format specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ choice ≤ 3

// 1 ≤ x1,y1,x2, y2 ≤ 50

// Sample test cases :
// Input 1 :
// 1
// 1.0 2.0 3.0 6.0
// Output 1 :
// Slope: 2.0
// Input 2 :
// 2
// 1.0 2.0 4.0 6.0
// Output 2 :
// Distance: 5.00
// Input 3 :
// 3
// 1.0 2.0 4.0 6.0
// Output 3 :
// Midpoint: (2.5, 4.0)
// Input 4 :
// 6
// Output 4 :
// Invalid choice. Please select a valid option.

import java.util.Scanner;
public class Coordinates{
    // You are using Java
 public static void main(String[] args) {
    //Type your code here
    int n;
    double x1, x2, y1, y2;
    Scanner sc= new Scanner(System.in);
    n= sc.nextInt();
    x1= sc.nextDouble();
    y1= sc.nextDouble();
    x2= sc.nextDouble();
    y2= sc.nextDouble();
    switch(n){
       case 1:
           double slope= (y2-y1)/ (x2-x1);
           System.out.println("Slope: "+slope);
           break;
       case 2:
           double distance = Math.sqrt(((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1)));
           System.out.println("Distance: "+String.format("%.2f",distance));
           break;
       case 3:
           double midpointX= (x1+x2)/2.0;
           double midpointY= (y1+y2)/2.0;
           System.out.println("Midpoint: ("+midpointX+", "+midpointY+")");
           break;
       default:
           System.out.println("Invalid choice. Please select a valid option.");
           break;
    }
    
}
}