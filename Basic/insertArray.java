import java.util.Arrays;
public class insertArray {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7,8,9,10};
        int idx=3;
        int ele=7;
        System.out.println("Before: "+Arrays.toString(a));
        for(int i=a.length-1;i>idx;i--)
            a[i]=a[i-1];
        a[idx]=ele;
        System.out.println("After: "+Arrays.toString(a));
    }
}
