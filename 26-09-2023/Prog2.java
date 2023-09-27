//wap to implement linear search prog using array of object concept;
import java.util.Scanner;

class Sample{
    int x;
    Sample(int a){x = a;}
}

class Prog2{
    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Size of array: ");
        int size = sc.nextInt();

        Sample[] arr = new Sample[size];
        for(int i =0; i< size; i++) {
            int tmp = sc.nextInt();
            arr[i] = new Sample(tmp);
        }

        System.out.print("Enter item to find :");
        int src = sc.nextInt();

        boolean flag = false;

        for(int i = 0; i< size; i++){
            if(arr[i].x == src)
                flag = true;
        }

        if( flag)
            System.out.println("Found");
        else
            System.out.println("Not Found");

        sc.close();
    }
    
}