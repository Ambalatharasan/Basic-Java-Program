public class string {
    public static void main(String[] args) {
        String a="Hello world";
        String b="Bye";
        String c="hello";
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C: "+c);
        System.out.println("Address of A: "+a.hashCode());//to print the memory address
        System.out.println("Address of b: "+b.hashCode());
        System.out.println("Address of c: "+c.hashCode());
        System.out.println("A equal B: "+a.equals(b));
        System.out.println("A equal c: "+a.equals(c));
        System.out.println("A equal c: "+a.equalsIgnoreCase(c));//ignore case sensitive
        System.out.println("Length of A: "+a.length());//to print total length of string
        System.out.println("Specific char in A: "+a.charAt(1));//to print specific character in a string
        System.out.println("UpperCase of A: "+a.toUpperCase());
        System.out.println("LowerCase of A: "+a.toLowerCase());
        System.out.println("Replace word in  A: "+a.replace("world", b));//to replace word in string
        System.out.println("Contain specific word in A: "+a.contains("world"));//to check the word is available
        System.out.println("Start With specific letter in A: "+a.startsWith("H"));
        System.out.println("End With specific letter in A: "+a.endsWith("d"));
        System.out.println("To cut word in A: "+a.substring(4));//it remove word before the specific index
        System.out.println("To display word between two index in A: "+a.substring(2,6));
        char[] str=a.toCharArray();
        for(char s:str)
            System.out.println("Character Array of A: "+s);
        System.out.println("Trim of A: "+a.trim());//remove unwanted space before and after a string
    }
    
}
