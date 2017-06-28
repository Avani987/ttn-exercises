import static java.util.Objects.isNull;

interface interfaceExample {

    default void dMethod(String str) {
        System.out.println("Interface default method printing : " + str);
    }

        static void sMethod(String str) {
            if (!isNull(str))
                System.out.println("Interface static method printing : " +str);
        }

    }

class interfaceMethods implements interfaceExample{
    public void dMethod(String str)
    {
        System.out.println("Overriding Interface default method, printing : " + str);
    }
}

public class Q5 implements interfaceExample {
    public static void main(String[] args) {
        Q5 obj = new Q5();
        interfaceMethods im=new interfaceMethods();
        im.dMethod("XYZ");
        obj.dMethod("ABC");
        interfaceExample.sMethod("abc");

    }
}
