public class togglecaseword {
    //toggle case- convert upper case to lower case in a string. [eg: HelLo-hELlO]
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("hElLo WoRLd");
        System.out.println(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){
                int b=(int)a.charAt(i)-32;
                a.setCharAt(i,(char)b);
            }
            else if(a.charAt(i)>=65 && a.charAt(i)<=90){
                int b=(int)a.charAt(i)+32;
                a.setCharAt(i,(char)b);
            }
        }
        System.out.println(a);
    }
}
