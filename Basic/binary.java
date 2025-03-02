
import java.util.Scanner;

public class binary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ld,bi=0,p=1;
        while(n>0){
            ld=n%2;
            n/=2;
            bi=bi+ld*p;
            p=p*10;
        }
        System.out.println(bi);
    }
}
