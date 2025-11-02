import java.io.*;

class PIP extends Thread {
    OutputStream os;

    public PIP(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        try {
            while (true) {
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                count++;
                Thread.sleep(10);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Pop extends Thread {
    InputStream is;

    public Pop(InputStream i) {
        is = i;
    }

    public void run() {
        try {
            int x;
            while (true) {
                x = is.read();
                System.out.println("Consumer: " + x);
                Thread.sleep(10);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Stream {
    public static void main(String[] args) throws Exception {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream();
        pis.connect(pos);

        PIP p = new PIP(pos);
        Pop c = new Pop(pis);

        p.start();
        c.start();
    }
}