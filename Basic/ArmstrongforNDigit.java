import java.util.Scanner;
public class ArmstrongforNDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int sum=0,ld,count=0;
        while(n!=0){
            ld=n%10;
            n/=10;
            count+=1;
        }
        n=copy;
        while(n!=0){
            ld=n%10;
            n/=10;
            sum+=Math.pow(ld,count);
        }
        if(sum==copy)
            System.out.println(copy+"-"+"Armstrong Number");
        else
            System.out.println(copy+"-"+"Not Armstrong Number");

    }
}
