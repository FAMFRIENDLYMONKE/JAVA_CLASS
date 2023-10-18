# METHOD OVERRIDING AND DYNAMIC METHOD DISPATCH

> **IMP**  
> * Differentiate between Method Overloading and Method Overriding?(2mark)
> * What do you mean Dynamic method dispatch? Explain with Example.(long q)


In Parent class access-specifier must carefully selected
If Parent ---> public  
then Child ---> public ( cannot be default)


However
Parent ---> default  
Child  ---> default or public

Parent ---> Protected  
Child  ---> Protected/public/default  


In case of method overriding the methods should have the same name and same signature but there should be a relationship in between the classes to which these methods belong to.

### DYNAMIC METHOD DISPATCH

Dynamic Method Dispatch is a mechanism that decides wether to call the parent class method or child class method.

* method overriding is also known as runtime polymorphism or dynamic polymorphism

* Child class is also known as sub class which parent class is also known as super class

* ```static``` and ```final``` methods cannot be overridden.

* ```main()``` method cannot be overridden 
```java
// Dynamic method Dispatch
```

