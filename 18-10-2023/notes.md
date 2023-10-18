# USER DEFINED EXCEPTION

* According to the application requirement we can design our own exception classes
* Syntax :
```java
<access_specifier> class_name extends Exception{
    //body
}
```

 **EXAMPLE**
```java
class A extends Exception{
    //body
}
```   

* Exception class is the super class of all types of exceptions.

> **VIMP**  
> Briefly Describe about user defined class creation and its use with suitable example?

# MULTITHREADING
* It is a concept that allows  parallel execution of instructions belonging to a program provided the program is written using concept of parallelism. 
* Multithreading makes application execution faster i.e., it decreases execution time of application.
* * Sequential programs 
* * Program with parallelism

### SEQUENTIAL PROGRAMS

```
read a,b,c,d
e = a + b
f = c + d
g = e + f
```

* Program execution starts from main thread
> **VIMP**  
> Thread (Light Weight) v/s Process (Heavy Weight)

Process is called heavy weight because spearate memory space is allocated.
but no free memory space is allocated for thread hence it is called light weight.



