import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a= new int[n];
        int i;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int element : a) {
            System.out.print(element+" ");
        }
    }
}
