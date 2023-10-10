//wap to show super constructor concept

class X{
    // X(String s){System.out.println(s);}
    int a;
    X(int x){a=x;}
    void display(){System.out.println("value ="+a);}
}

class Y extends X{
    // Y(String x){
    //     super(x);
    //     System.out.println("Constructor 1");
    // }
    int z;
    Y(int a, int b){
        super(a);
        z = b;
    }
    void display(){
        super.display();
        System.out.println("value="+z);
    }
    }

class Prog2{
    public static void main(String args[]){
        Y ob = new Y(3,4);
        ob.display();
    }
}