import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,copy=n,ld;
        while (n>0) {
            ld=n%10;
            n/=10;
            int fact=1;
            for(int i=1;i<=ld;i++){
                fact*=i;
            }
            sum+=fact;
        }
        if(copy==sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not a Strong Number");
    }
}