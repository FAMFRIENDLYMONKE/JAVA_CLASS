# this keyword
> It refers to the current object of a class.

### USES OF this KEYWORD    
* refers current class instance variables.  (IMP)
* invokes current class method implicitly.  
* invokes current class constructor   (IMP)
* passed as argument in method call.  
* passed as argument in constructor call.  
* returns current class instance 

these are some of the uses of this keyword  

### DIFFERENCE BETWEEN LOCAL AND INSTANCE VARIABLES

1. Both are written differently in JAVA.





### SYNTAX

```this.variable = value;```  

**EXAMPLE**   
```
//this keyword
class X{
    int a,b,c;
    X(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void show(){
        System.out.println("A: " + a + " B: " + b + " C: " + c);

    }
}
class Y{
    public static void ain(String args[]){
        X ob = new X(5,6,7);
        X ob1 = new X(8,9,10);
        ob.show();
        ob1.show();
    }
}
```

### INVOKES CURRENT CONSTRUCTOR
**SYNTAX**  
```
class X{
    X()
    {
        System.out.println("Hello");
        }
    X(int a){
        System.out.println("value = "+a);
    }
}

class Y{
    public static void main(String args[])
    {
        X ob = new X(); //executes default constructor
        X ob1 = new X(5); //executes parametrised constructor

    }
}

//in order to execute the default constructor we need to modify class X as follows
class X{
    X()
    {
        System.out.println("Hello");
        }
    X(int a){
        this();
        System.out.println("value = "+a);
    }
}
```

another method to invoke a method of a class/obj

```new X().display()```

### IMP
> What is the use of **this** keyword (2 marks).


```public void method(parameter-list)```


here the parameter list can contain both primitive and Class type variables

It is generally not easy to remember all types of objects in parameter list so we pass a reference to the this instance to the method.


It is of two types??
<!-- need reference  -->



```return object;```  
can be replacd by  
```return this;```  

**EXAMPLE**  
```
//assuming class x is defined as
int a, int b, bool c

public X method1(X ob){
    //body
    X ob2 = new X();
    return ob2;
}

//assume main func
X ob1 = new X();
method1(ob1);

/**
ob becomes equal to ob1 when it is passed to ob
and implicity the JVM performs:
ob.a = ob1.a;
ob.b = ob1.b;
ob.c = ob1.c;
*/


```
