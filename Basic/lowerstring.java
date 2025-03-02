public class lowerstring {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Hello hi");
        System.out.println(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=65 && a.charAt(i)<=90){//upper case char ASCII value(65-a::90-z)
                int b=(int)a.charAt(i)+32;//to convert uppercase by removing ASCII value(97-a::122-z)65+32=97
                a.setCharAt(i,(char)b);//case conversion to change int to char
            }
        }
        System.out.println(a);
    }
}
