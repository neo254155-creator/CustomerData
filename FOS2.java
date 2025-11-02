import java.io.FileOutputStream;
public class FOS2 {
    public static void main (String args[])
    {
        try{
    FileOutputStream fos1=new FileOutputStream( "C:\\Users\\Aditya\\output1.txt");
    String str1="WELCOME AGAIN IN FOS";
    fos1.write(str1.getBytes(),0,13);  //writing bytes from index 1 to 13
    fos1.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
