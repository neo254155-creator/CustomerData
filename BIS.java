import java .io.*;
public class BIS {
    public static void main (String arg[])throws Exception{
        byte b[]={'a','s','f','r','g','y'};
        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);
 
        bis.close();       //int x;
        //while((x=bis.read())!=-1){
        //System.out.print((char)x);
   // }.

    }

}