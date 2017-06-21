import java.util.* ;
import java.text.*;

public class Q8 {

        public static void main(String args[]) {

            Date d = new Date( );
            SimpleDateFormat ft = new SimpleDateFormat("dd-MMMM-YYYY");

            System.out.println("Current Date: " + ft.format(d));
        }

}
