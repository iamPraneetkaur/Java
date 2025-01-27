import java.util.*;
public class zigzag{
    public static void main(String args[]){
        int n, x, l, k, c;
        String s, p="";
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        s= sc.nextLine();
        System.out.println("Enter number of rows: ");
        n= sc.nextInt();
        l= s.length();
        int y= n+(n-2);
        // k= ((l%y)==0)?(l/y):((l/y)+(l%y));
        k= l/2 +1;
        char arr[][]= new char[k][n];
        c=0;
        if(l==1 || n==1){
            p= s;
        }
        else{
            for(int i=0; i<k; i++){
                for(int j=0; j<n; j++){
                    x= i%(n-1);
                    if(c>l-1){
                        break;
                    }
                    else{
                        if(x==0){
                            arr[i][j]= s.charAt(c++);
                        }
                        else if((i+j)%(n-1)==0){
                            arr[i][j]= s.charAt(c++);
                        }
                        else{
                            arr[i][j]= ' ';
                        }
                    }
                }
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<k; j++){
                    if(arr[j][i]==' '){
                        continue;
                    }
                    p= p+ arr[j][i];
                }
            }
            
        }
        System.out.println(p);
    }
}