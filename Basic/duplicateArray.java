public class duplicateArray {
    public static void main(String[] args) {
        int a[]={1,2,3,3,5,2,6,1,8,6,10};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j)//element contain same value a[i],a[j] but different index i,j
                    System.out.println("Dupilcate Element: "+a[j]);
            }
        }
    }
}
