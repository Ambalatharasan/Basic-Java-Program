public class jaggedEnhanceLoopArray {
    public static void main(String[] args) {
        int a[][]={
            {10,20,30},
            {1,2,3,4,5},
            {6,7,8,9,10,11,12}
        };
        for(int b[]:a){
            for(int c:b){
                System.out.print(" "+c);
            }
            System.out.println("");
        }
    }
    
}
