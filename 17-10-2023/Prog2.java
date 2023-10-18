//rewrite the above program to include finally block
import java.util.Scanner;

class Prog2{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        int[] c = new int[5];
        a = sc.nextInt();
        b = sc.nextInt();
        for(int i = a; i < b; i++){
        try{
            c[i] = a/b;
            a++;
            b--;
           
        }
        catch(ArithmeticException ob)
        {
            System.out.println("Zero Division");
            continue;
        }
        catch(ArrayIndexOutOfBoundsException ob1)
        {
            System.out.println("a or b is out of range of array");
            break;
        }
        finally{
            System.out.println("No Error");
        }
    }
    }
}