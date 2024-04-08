import java.util.*;
public class FloydsTriangle
{ 
    public static void main(String args[])
    {
        System.out.println("Enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int number_of_rows = sc.nextInt();
        int k=1;
        for(int i=0; i<number_of_rows;i++){
            for(int j=0; j<=i; j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}