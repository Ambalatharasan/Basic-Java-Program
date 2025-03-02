
import java.util.Scanner;

//a2b3c4->aabbbcccc
public class Expand {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int count;
        for(int i=0;i<a.length();i+=2){
            char b=a.charAt(i);
            count=a.charAt(i+1)-'0';
            for(int j=0;j<count;j++){
                System.out.print(b);
            }
        }
    }
}
