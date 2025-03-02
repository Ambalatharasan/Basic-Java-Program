public class countCase {
    public static void main(String[] args) {
        StringBuilder buffer=new StringBuilder("Ambalam-@123 Zt002");
        System.out.println(buffer);
        int upper=0,lower=0,space=0,number=0,vowels=0;
        for(int i=0;i<buffer.length();i++){
            if(buffer.charAt(i)>=97 && buffer.charAt(i)<=122)//a-z
                lower++;
            if(buffer.charAt(i)>=65 && buffer.charAt(i)<=90)//A-Z
                upper++;
            if (buffer.charAt(i)==32)//space 
                space++;
            if(buffer.charAt(i)>= 48 && buffer.charAt(i)<=57)//0-9
                number++;
            if(buffer.charAt(i)=='a'||buffer.charAt(i)=='e'||buffer.charAt(i)=='i'||buffer.charAt(i)=='o'||buffer.charAt(i)=='u'||buffer.charAt(i)=='A'||buffer.charAt(i)=='E'||buffer.charAt(i)=='I'||buffer.charAt(i)=='O'||buffer.charAt(i)=='U')
                vowels++;
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(space);
        System.out.println(number);
        System.out.println(vowels);
        System.out.println("Symbols:"+(buffer.length()-(upper+lower+space+number)));//to print symbol by minus total length by upper, lower, space, number count
    }
}
