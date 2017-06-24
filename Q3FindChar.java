import java.util.Scanner;

public class Q3FindChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Enter the character whose occurence you want to find");
        char c = scan.next(".").toLowerCase().charAt(0);

        int count = str.length()-str.replaceAll(String.valueOf(c),"").length();
        System.out.println(c+" occurs "+count+" times");
        scan.close();
    }

}
