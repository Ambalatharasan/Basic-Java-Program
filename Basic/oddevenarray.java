import java.util.Scanner;

public class oddevenarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int odd=0, even=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int ele:a){
            if(ele%2==0)
                even++;
            else
                odd++;
        }
        System.out.println(even);
        System.out.println(odd);
    }   
}