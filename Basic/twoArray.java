import java.util.Scanner;
import java.util.*;
import java.util.Arrays;
public class twoArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a[][]=new int[n1][n2];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                a[i][j]=sc.nextInt();
                // System.out.println(a[i][j]);
            }
        }
        for(int i=0;i<n1;i++,System.out.println("")){
            for(int j=0;j<n2;j++){
                // a[i][j]=sc.nextInt();
                // System.out.print(Arrays.toString(a[i][j]));
                System.out.print(" "+a[i][j]);
            }
        }
    }
}
