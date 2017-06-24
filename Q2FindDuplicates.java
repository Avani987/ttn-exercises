import java.util.*;

public class Q2FindDuplicates {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=scan.nextLine();

        List<String> list = Arrays.asList(str.split(" "));
        Set<String> uniqueWords = new HashSet<>(list);
        for(String word : uniqueWords) {
            if (Collections.frequency(list, word) > 1)
                System.out.println(word + ": " + Collections.frequency(list, word));
        }

    }
}
