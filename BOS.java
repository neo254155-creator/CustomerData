import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
public class BOS {
    public static void main(String args[]){
try {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(10);
        bos.write('a');
        bos.write('s');
        bos.write('f');
        bos.write('r');
        bos.write('g');           
        bos.write('y');
        bos.writeTo(new FileOutputStream("C:\\Users\\Aditya\\STD_B.txt"));

        bos.close();
    } catch (Exception e) {
        System.out.println(e);
    }
    }
}
