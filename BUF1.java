import java .io.BufferedInputStream;
import java.io.FileInputStream;
public class BUF1 {
    public static void main (String args[]){
        try{
            FileInputStream fr= new FileInputStream("C:\\Users\\Aditya\\STD_B.txt");
            BufferedInputStream br=new BufferedInputStream(fr);
        int x;
    while ((x=br.read())!= -1) {
        System.out.print((char)x);
       //br.mark(3);
       //System.out.println("\n"+(char)br.read());

    }
    br.close();
}
        catch(Exception e){
            System.out.println(e);
        }                                   
    }
}




