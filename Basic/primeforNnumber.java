import java.util.Scanner;

public class primeforNnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Initial Number: ");
        int n1=sc.nextInt();
        System.out.print("Enter End Number: ");
        int n2=sc.nextInt();
        int c=0;
        for(int n=n1;n<=n2;n++){
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    c++;
            }
            if(c==2)
                System.out.println(n+" is a Prime Number");
            c=0;
        }
    }
}
