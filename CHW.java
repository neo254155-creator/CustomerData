import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CHW {
    public static void main(String[] args) {
        try {
            CharArrayWriter cr = new CharArrayWriter();
            cr.write('a');
            cr.write('b');

            // Wrap the file path in a FileWriter
            FileWriter fw = new FileWriter("C:\\Users\\Aditya\\STD_B.txt");
            cr.writeTo(fw);

            fw.close();
            cr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}