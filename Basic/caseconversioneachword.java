public class caseconversioneachword {
    public static void main(String[] args) {
        //capitalize each word in a string
        StringBuilder a=new StringBuilder("hELlo wOrlD");
        System.out.println(a);
        if(a.charAt(0)>=97 && a.charAt(0)<=122){
            int b=(int)a.charAt(0)-32;
            a.setCharAt(0, (char)b);
        }
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)==32){//to check space occurrence
                i++;//if space available, move to next index
                if(a.charAt(i)>=97 && a.charAt(i)<=122){
                    int b=(int)a.charAt(i)-32;
                    a.setCharAt(i,(char)b);
                }
            }else{
                if(a.charAt(i)>=65 && a.charAt(i)<=90){
                    int b=(int)a.charAt(i)+32;
                    a.setCharAt(i,(char)b);
                }
            }
        }
        System.out.println(a);
    }
}
