import java .io.*;
public class PIP extends Thread{ 
    OutputStream os;
    public PIP(OutputStream o){
        os=o;
    }
    public void run (){
        int count =1;
        while (true){
            os.write(count);
            os.flush();
            System.out.println("producer"+count );
            System.out.println(flush());
            count++;
            Thread.sleep(10);
           
        }
    }
}
    

public class pop extends Thread{
    InputStream is;
    public pop(InputStream i){
        is=i;
    }
    public void run(){
        int x;
        while (true){
            x=is.read();
            
            System.out.println("consumer"+x);
            System.out.println(flush());
            Thread.sleep(10);
        }

    }
}

class stream{
    public static void main (String args[])throws Exception{
    PipedOutputStream pos=new PipedOutputStream();
    PipedInputStream pis=new PipedInputStream();
    pis.connect(pos);
PIP p=new PIP(pos);
pop c=new pop(pis);

p.start();
c.start();

    }
}
    





