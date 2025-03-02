//static block run before main function execute. it first run static method/block then it load the main block
class sample{
    static{
        System.out.println("Sample-1");
    }
    static{
        System.out.println("Sample-2");
    }
}
public class staticblock {
    static{
        System.out.println("Block-1");
    }
    public static void main(String[] args) {
        sample s=new sample(); 
        System.out.println("Main Block...");
    }
    static{
        System.out.println("Block-2");
    }
}
