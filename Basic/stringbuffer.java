public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer("Hello");//string buffer is mutable, it create separate memory for same variable
        System.out.println(buffer);
        buffer.append("World");//it allow string to modify there value
        System.out.println(buffer);
        buffer.insert(10, "Bye");
        System.out.println(buffer);
        buffer.replace(3, 6, "#12");
        System.out.println(buffer);
        buffer.delete(6, 8);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(3));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(2, 5));
        buffer.setCharAt(2, '^');
        System.out.println(buffer);
    }
}
