// function overriding

import java.util.*;


class Name{
    private int id = 0;
    Name(int i){id = i;}
    void show(){System.out.println("ID: "+id);}
}

class Staff extends Name{
    private int sal = 0;
    Staff(int s, int id){
        super(id);
        sal = s;}
    void show(){System.out.println("Salary: "+sal);}
}

class Students extends Name{
    private int marks=0;
    Students(int m, int id){super(id); marks=m;}
    void show(){System.out.println("Marks: "+marks);}
}

class Faculty extends Name{
    private String teach;
    Faculty(String a, int id){super(id); teach = a;}
    @Override
    void show(){System.out.println("Subject Teaching: "+teach);}
}

class Prog1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        Name ob1 = new Name(id);
        int sal = sc.nextInt();
        Staff ob2 = new Staff(sal);
        int marks = sc.nextInt();
        Students ob3 = new Students(marks);
        String sub = sc.next();
        Faculty ob4 = new Faculty(sub);
        Name ref;
        ref = ob1;
        ref.show();
        ref = ob2;
        ref.show();
        ref = ob3;
        ref.show();
        ref = ob4;
        ref.show();
    }
}