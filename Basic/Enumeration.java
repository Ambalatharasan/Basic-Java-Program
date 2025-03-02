public class Enumeration {//its a special class for manage constant value
    enum level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        //Assign Enum variable
        level a=level.HIGH;
        System.out.println(a);
        //use enum in switch case
        switch(a){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        //enum by loop
        for(level lvl:level.values())
            System.out.println(lvl);
    }
}
