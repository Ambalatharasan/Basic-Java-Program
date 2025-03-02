public class jaggedArray {//different dimansion of Array size 
    public static void main(String[] args) {
        int a[][]={
            {10,20,30},
            {1,2,3,4,5},
            {6,7,8,9,10,11,12}
        };//this type of array size element are jagged array
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println("");
        }
    }
}
