import java .io.FileInputStream;
import java.io.FileOutputStream;
public class STD {
    public static void main (String args[]){
        try{
            FileInputStream fis =new FileInputStream("C:\\Users\\Aditya\\IdeaProjects\\STD.java.txt");
            byte b[]=new byte[fis.available()];  //available method returns no of bytes present in file
            fis.read(b);
            FileOutputStream fos=new FileOutputStream("C:\\Users\\Aditya\\IdeaProjects\\STD1.java.txt");
            String str=new String (b);
            fos.write(b);
            System .out.println(str.toLowerCase());
            fis.close();
            fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
