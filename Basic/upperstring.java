public class upperstring {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Hello hi");
        System.out.println(a);
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=97 && a.charAt(i)<=122){//lower case char ASCII value(97-a::122-z)
                int b=(int)a.charAt(i)-32;//to convert uppercase by removing ASCII value(65-A::90-Z)97-32=65
                a.setCharAt(i,(char)b);//case conversion to change int to char
            }
        }
        System.out.println(a);
    }
}
