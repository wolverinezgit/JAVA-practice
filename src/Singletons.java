class Singly{


    public static Singly obj;

    public static Singly getObj()
    {
        if(obj==null)
        {
            obj=new Singly();
        }
        return obj;
    }
}

public class Singletons {
    public static void main(String[] args) {


 String s1="Harsh";
 String s2="Harsh";

 System.out.println(s1==s2);
        System.out.println(Singly.getObj());
        System.out.println(Singly.obj.getClass());

    }
}
