import java.util.Scanner;

class Sample{}

class X{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scaneer(System.in);
        int[] c = new int[5];
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i < b; i++){
        try{
            c[i] = a/b;
            a++;
            b--;
           
        }
        catch(ArithMeticException ob)
        {
            System.out.println("Zero Division");
            continue;
        }
        catch(ArrayIndexOutOfBoundException ob1)
        {
            System.out.println("a or b is out of range of array");
            break;
        }
    }
    }
}