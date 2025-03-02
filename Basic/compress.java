
import java.util.Scanner;

//aaabbcccc->a3b2c4
public class compress {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int count=1;
        for(int i=0;i<a.length();i++){
            if(i<a.length() - 1 && a.charAt(i)==a.charAt(i+1))
                count++;
            else{
                System.out.print(a.charAt(i)+""+count);
                count=1;
            }
            
        }
    }
}
