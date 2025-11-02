import java .io.CharArrayWriter;
public class CHW {
    public static void main (String args[])
    {
        CharArrayWriter cr=new CharArrayWriter();
        cr.write('a');
        cr.write('b');  
        cr.writeTo("C:\\Users\\Aditya\\STD_B.txt");
        cr.close();
    }
    
}
