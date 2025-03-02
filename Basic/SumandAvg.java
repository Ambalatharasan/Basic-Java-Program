import java.util.Scanner;

public class SumandAvg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int avg=0;
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            sum+=num;
            avg=sum/n;
        }
        System.out.println("Sum "+sum);
        System.out.println("Average "+avg);
    }
    
}
