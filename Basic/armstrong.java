import java.util.Scanner;

public class armstrong {//for 3 numbers
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int sum=0, ld;
        while(n>0){
            ld=n%10;
            n/=10;
            sum+=(ld*ld*ld);
        }
        if(sum==copy)
            System.out.println("Armstrong Number...");
        else
            System.out.println("Not");
    }
    
}
