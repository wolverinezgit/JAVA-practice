class P1
{

    static int x=0;
    static void printF()
    {
        System.out.println("I am from parent");
    }

}
class C1 extends P1{



}

public class inheritance {
    public static void main(String[] args) {
    C1.printF();
    P1.x=1;
    System.out.println(C1.x);
    }
}
