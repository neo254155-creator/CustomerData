
import java.io.FileInputStream;


public class FIS {
    public static void main (String args[]){
        try{
        FileInputStream fr =new FileInputStream("C:\\Users\\Aditya\\output.txt");
        byte b[]=new byte[fr.available()];  //available method returns no of bytes present in file
        fr.read(b);
        String str=new String(b);
        System.out.println(str);
        fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

}