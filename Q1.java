
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Q1 {
    public static void main(String[] args) {

        InputStream inStream = null;
        OutputStream outStream = null;

        try{

            File infile =new File("input.txt");
            File outfile =new File("output.txt");

            inStream = new FileInputStream(infile);
            outStream = new FileOutputStream(outfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length = inStream.read(buffer)) > 0){

                outStream.write(buffer, 0, length);

            }

            inStream.close();
            outStream.close();

            System.out.println("File is copied successfully!");

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}






