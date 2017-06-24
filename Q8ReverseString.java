public class Q8ReverseString {

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Avani Khurana");
        str.reverse();
        str.delete(4,9);
        System.out.println("The string is::"+str);
    }
}
