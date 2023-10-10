# INHERITANCE

* Inheritance is the property that allows code re-usability (packages also allow code resuability)  
* **Child CLasses** inherits features from its **Parent Class**
* We can have a class inside a class (nested Classes)
* * Nested Class 
* * Inner Class

> **IMP**  
> What is difference ebwteen Nested and inner class.

* All Properties of Parent Class are NNot Inherited.

* In Class the private methods of Parent Class are not inherited to the Child Classes.

> **Read More**  
> Diamond Inheritance Problem

* It is determined by access specifier (defualt, public)  
* Protected methods are inherited to immediate child class.
* There are 2 types of Inheritance.
* * Single Inheritance
* * Multi-Level Inheritance
* If both the parent and child class have their own constructors then priority of child class costructor is more (i.e. hides/cloaks parent class contructor)
* If we want to use parent class Constructor then we need to use Super() keyword
* Super Keyword must be the First line of the child class Constructor Body.
* In Parent class and Child Class contains Variables with same name then, priority of child class variables is more over parent class variable.

> To access the parent class variables then  
> ```Super.variable ```
* JAVA Supports ```extends``` keyword to support/enforce **Inheritance**

```java
class X
{
    void display(){
        System.out.println("Hello");
    }

}

public class Y extends X
{
    void Show(){
        System.out.println("Hi");
    }
    
    //class Y has 2 methods (1 from X + 1 from Y)

}

public class Z
{
    public static void main(String args[]){
        Y ob = new Y();
        ob.display();
        ob.show();
    }
}
```


 





