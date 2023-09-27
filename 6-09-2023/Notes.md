# STRUCTURE OF A JAVA PROGRAM

A JAVA Program Contains   
1. Comments
2. Class(es)
3. main() Method
4. Code Statements

#### COMMENTS
> Comments are short text that are written in the program to explain the login of the code to improve Readability.

Comments are skipped by the compiler/intepreter and are a part of almost every programming language in existence.
 
There are 3 types of Comments in Java:
```
// Single Line Comment
// can be placed anywhere in the program

/*
* Multi Line Comment:
* Used to write multiple lines of comments
*/

/** 
Documentation Comment:
It is generally used at the beginning of a program to explain in detail the purpose/objective of the program with accreditation.
*/
```


## CLASS
> A java program can have one or more classes in it. Each class defines functionality of a specific type of object.

A class has objects and variables inside it.
The class within which main() is defined is called  the initial class.
The name of the java program file should be the Same as the initial class.

**SYNTAX**  
```
<access-specifier> class class_name{
    //variables
    int a,b,c;
    //methods
    void display(){System.out.println(a);}
    //etc
}

```

**ACCESS SPECIFIERS**
>Can be either private or protected or public. These keywords are used to determine the type of access to the functions. Default is **friendly**, not a keyword.

## MAIN()
> It is the entry point of every JAVA application. If there are multiple classes then the program starts from the initial class, i.e. the class containing the main method.

**SYNTAX**
```
class name_of_prog_file{
    public static void main(String args[]){
        //body
    }
}
```

## CODE STATEMENTS
> Methods inside the classes contain the real functionality in a JAVA program. These are the code statements written following the Syntax and the Semantics of JAVA Programming Language.

