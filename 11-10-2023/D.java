//Dyanmic Method Dispatch


class A{
    void show(){
        System.out.println("A");
    }
}
class B extends A
{
    void show(){
        System.out.println("B");
    }
}

class C extends A
{
    void show(){
        System.out.println("C");
    }
}

class D {
    public static void main(String args[]){
        A ob = new A();
        B ob1 = new B();
        C ob2 = new C();
        A ref;
        ref = ob;
        ref.show();
        ref = ob1;
        ref.show();
        ref = ob2;
        ref.show();
    }
}