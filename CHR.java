
import java.util.*;
public class CHR {
    public static void main (String args[]) throws Exception
    {
        char ch ={'a','b','s','j','d','e'};
        CharArrayReader cr=new CharArrayReader(ch);
      int x;
      while ((x=cr.read())!=-1){
        System.out.print((char)x);
      }
    }
}



