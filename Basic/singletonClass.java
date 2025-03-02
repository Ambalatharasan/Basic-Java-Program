class single{
    static single obj=null;//set initial static object as null value
    private single(){}//set default constructor as private for restrict create object
    public static single instance(){//assign new variable for access constructor for single class
        if(obj==null)
            obj=new single();//if the initial object is null, then it allow the user to create object for one time and return it
        return obj;
    }
    void output(){
        System.out.println("Output...");
    }
}
public class singletonClass {//this class allow user to create single object for the class
    public static void main(String[] args) {
        single s=single.instance();//call by method
        s.output();
    }
}
