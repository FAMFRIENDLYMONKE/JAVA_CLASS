// improt java.util.Scanner;

//change name of method from show to display

class X{
    void display(){
        System.out.println("Hello");
    }
}


class Y extends X {
    void display(){
        super.display();
        System.out.println("Hi");
    }
}

class Prog1
{
    public static void main(String args[]){
        Y ob = new Y();
        ob.display();
    }
}