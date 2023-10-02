# CONSTRUCTOR IN JAVA

## Uses of a Constructor
1. Initialisation of instance variable
2. Constructor signature is very similar to method signature except there is no return type in method signature.  
3. Body of Constructor is defined according to requirement
4. Access specifier of constructor may be public or private or default
5. There should not be any keyword like static, synchronoised in constructor signature.
6. name of Constructor = Name of Class

**Syntax**
```
access_specifier class_name{
    //body
}
```

There are 2 Types of Constructors
1. Parametrised 
2. Defaut(Non-Parametrised Constructor)

> JVM creates an empty constructor automatically if no constructor is defined

## Constructor Overloading
> When the same Construcotr(same as class name) has multiple definition with different parameter list it is known as Constructor Overloading.


### DIFFERENCE BETWEEN METHOD AND CONSTRUCTOR

* Instance Variable declaration can be done using a constructor but cannot be done in case of methods.

* There is no copy constructor in java but contents of an object can be copied to another object in two ways:

1. floor method(object flooring concept)
2. Copy the instance (variables one by one)

**Example:**
```java
x{
    int a,b;
}

X ob = new X();
ob.a = 5;
ob.b = 6;
X ob2 = new X();
ob2.a = ob.a;
ob2.b = ob.b;
```

## Memory Deallocation

Memory deallocation is required when variable is not in use and we have to create space for new variables.

In JAVA the task is automatically performed by the JVM garbage collector & the method responsible for garbage collection and deallocation in finaliser.
