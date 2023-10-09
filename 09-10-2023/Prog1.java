//wap that shows the conversion of primitive type data to object type

import java.io.*;

class Prog1{
    public static void main(String args[]){
        int a=0;
        float b=0.0F;
        double c=0.0D;
        String d="";
        byte e=0;
        boolean f=false;
        short g=0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try{
            a = Integer.parseInt(br.readLine());
            b = Float.parseFloat(br.readLine());
            c = Double.parseDouble(br.readLine());
            d = br.readLine();
            e = Byte.parseByte(br.readLine());
            f = Boolean.parseBoolean(br.readLine());
            g = Short.parseShort(br.readLine());
            br.close();
        }catch(IOException x){
            System.out.println("error input");
        }

        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n"+f+"\n"+g);
    }
}