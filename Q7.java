package assignments.corejava;


public class Q7 {
    static String firstName;
    static String lastName;

    static {
        firstName="Avani";
    }

    static void display(){
        lastName="Khurana";
        System.out.println("Last Name:"+lastName);
    }

    static int age=23;

    public static void main(String[] args) {
        System.out.println("First Name is: "+firstName);
        display();
        System.out.println("Age is: "+age);
    }
}
