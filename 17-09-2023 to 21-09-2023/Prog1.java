import java.util.Scanner;
class Sample{
    int x,y,z;
    Sample(int a, int b, int c){x=a;y=b;z=c;}

    void area(){
        int s = (x+y+z)/2;
        System.out.println("Area = " +Math.sqrt((s*(s-x)*(s-y)*(s-z))));
    }
}

public class Prog1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Sample ob = new Sample(a,b,c);
        ob.area();
    }
    
}
