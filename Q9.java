import java.text.DateFormat;
import java.util.*;

public class Q9 {
        public static void main(String[] args) throws Exception {
            Date d1 = new Date();
            System.out.println("today is "+ d1.toString());
            Locale locgerman = new Locale("de","de_DE");
            DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, locgerman);
            System.out.println("In German Language and in Germany's Format : "+ df.format(d1));
            Locale locjapan = new Locale("ja","ja_JP");
            DateFormat df1 = DateFormat.getDateInstance (DateFormat.FULL, locjapan);
            System.out.println("In Japanese Language, in Japan's Format : "+ df1.format(d1));
        }
    }

