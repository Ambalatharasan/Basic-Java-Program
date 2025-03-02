import java.util.Scanner;

public class basearray {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[]={1,2,3,4,5,6,7,8,9,10};//fixed declaration
       // System.out.println(a[4]);//call value based on index number
        for(int i=0;i<a.length;i++)//iterate based on array size(a.length)
            System.out.println(a[i]);
        

        for(int ele:a)//enhance for loop
            System.out.println(ele);
    }
}
