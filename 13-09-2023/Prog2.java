import java.util.Scanner;

class Sample{
    int s = 0;
    void sumOfDigits(int a){
        if(a > 0){
            s += a%10;
            sumOfDigits(a/10);
        }else
        {
            display();
        }
    }
    void display(){
        System.out.println("Sum ="+s);
    }
}

class Prog2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number:");
        a = sc.nextInt();
        Sample ob = new Sample();
        ob.sumOfDigits(a);
        
    }
}