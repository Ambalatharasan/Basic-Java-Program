public class revstring {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Hello World!");
        System.out.println(a);
        StringBuilder b=new StringBuilder();
        // b.append(a.reverse());
        for(int i=a.length()-1;i>=0;i--)
            b.append(a.charAt(i));
        System.out.println(b);
    }
    
}
