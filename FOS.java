import java.io.FileOutputStream;
public class FOS{
public static void main (String args[]){
    try{
    FileOutputStream fos =new FileOutputStream( "C:\\Users\\Aditya\\output.txt");
    String str="Welcome to File Output Stream in Java";
    fos.write(str.getBytes());                            //creating set of byte of string
    fos.close();
    }
    catch (Exception e){
        System.out.println(e);
    }
}
}