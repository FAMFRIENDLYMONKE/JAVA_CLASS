//user_defines exception
import java.io.*;

class IndError extends Exception{
    IndError(String msg){super(msg);}
}

public class X{
    public static void main(String args[]){
        try{
            System.out.println("Enter a String");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String ms = br.readLine();
            if (!ms.equals("INDIA"))  throw new IndError("String is not equal to INDIA");
        }
        catch(Exception e){
            System.out.println("Exception Caught\n"+e);
        }
    }
}