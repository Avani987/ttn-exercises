import java.io.*;

public class Q9ReadFile {
    public static void main(String[] args) {

        StringBuilder line = new StringBuilder();
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("temp.txt"));
            String text = null;
            while ((text = reader.readLine()) !=null)
            {
                line.append(text).append(System.getProperty("line.separator"));

            }

        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException ei)
        {
            ei.printStackTrace();
        }
        System.out.println(line.toString());

    }
}
