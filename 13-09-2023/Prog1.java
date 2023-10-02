import java.io.*;

class Sample{
    int n = 1;
    void factorial(int a){
        if (a!=0){
            n*=a;
            factorial(a-1);
        }
    }
    void disp(){
        System.out.println("Factorial is :"+n);
    }
}

class Prog1{
    public static void main(String args[]){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter A Number");
        int a=0;
        try{
            a = Integer.parseInt(bf.readLine());
        }catch(IOException e)
        {
            System.out.println("Exception Input/Output");
        }
        Sample obj = new Sample();
        obj.factorial(a);
        obj.disp();
    }
}