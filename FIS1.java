import java.io.FileInputStream;
public class FIS1 {
  public static void main (String args []){
    try{
      FileInputStream fis1=new FileInputStream("C:\\Users\\Aditya\\output.txt");
      int x;
      while ((x=fis1.read())!=-1){
          System.out.print((char)x);
      }
    }
    catch (Exception e){
        System.out.println(e);
    }
  }  
}
