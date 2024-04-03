import java.util.*;
public class DDArray
{
    public static void main(String Args[])
    {
        int N, i, j;
        char a,b,c,ar[][];
        Scanner sc= new Scanner(System.in);
    
        System.out.println("First Character: ");
        a= sc.nextLine().charAt(0);
        System.out.println("Second Character: ");
        b= sc.nextLine().charAt(0);
        System.out.println("Third Character: ");
        c= sc.nextLine().charAt(0);
        System.out.println("N: ");
        N= sc.nextInt();
        ar=new char[N][N];
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if((i==0 || i==3) && (j==0 || j==3))
                ar[i][j]=a;
                else if((i==1 || i==2) && (j==1 || j==2))
                ar[i][j]=c;
                else
                ar[i][j]=b;
            }
        }
        for(i=0; i<N; i++)
        {
            for(j=0; j<N; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}