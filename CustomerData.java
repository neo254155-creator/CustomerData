import java.io.*;
import java.util.*;

public class CustomerData implements Serializable{
    public String custID;
    public String custName;
    public long phNO;
    
    static int count = 1;

    public CustomerData(){
    }

    public CustomerData(String custID, String custName, long phNO) {
        this.custID = custID;
         count++;
        this.custName = custName;
        this.phNO = phNO;
       
    }
    public String toString(){
        return "Customer ID:" + custID + " Customer Name:" + custName + " Phone Number:" + phNO;
    }
    public static void main (String args[])throws Exception{
        CustomerData List[]={new CustomerData("C001","VIRAT KOHLI",9876543210L),new CustomerData("C002","ADITYA",8765432109L),new CustomerData("C003","STEVE SMITH",7654321098L)};
        
         FileOutputStream fos=new FileOutputStream("C:\\Users\\Aditya\\STD_B.txt");
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeInt(List.length);
         for(CustomerData C: List){
            oos.writeObject(C);
         }
        oos.close();
        fos.close();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        FileInputStream fis=new FileInputStream("C:\\Users\\Aditya\\STD_B.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        int length =ois.readInt();
        CustomerData list[]=new CustomerData[length];
        for(int i=0;i<length;i++){
            list [i]=(CustomerData)ois.readObject();
        }
        System.out.println("ENTER NAME OF CUSTOMER" );
        String name =sc.nextLine();
        for(int i=0;i<length;i++){
            if(list[i].custName.equalsIgnoreCase(name)){
             System.out.println(list[i]);
            }
        }
        ois.close();
        fis.close();
        sc.close();
    }
}


    

        

    
