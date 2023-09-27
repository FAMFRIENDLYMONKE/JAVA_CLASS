# COMMENTS IN JAVA

described in 5-09-2023 notes

# VARIABLES IN JAVA
Syntax to create a variable in JAVA  

```data_type variable_identifier = data_type_literal;```

initialisation is mandatory for static variables.

Type of variables:  
1. Class Type
2. Instance Type
3. Local Type


# OUTPUT STATEMENTS IN JAVA

They are of 2 Types:  
1. ```System.out.print();```

2. ```System.out.println();```

'\+' is the Concatenation operator.

**EXAMPLE**  
```System.out.print("Hello My Name is " + name + "\n" + "Have a nice Day" + "\n");```

### WHITESPACES
> tab, newline, space, backspace are defined as whitespaces and they display a blank space on screen(traditionally called a whitespace)


### ESCAPE CHARACTERS
> \n \t \v \special-character similar to C

# INPUT IN JAVA
It can be done via 3 methods:  
1. Command Line Arguments  
2. ReadLine()
3. Scanner Class

### Command Line Arguments
It uses String args[]
```
javac x.args
//supply the command line arguments with command java <program> <command line arguments as a space delimited list>

java x 12 13 14 15

//they can be acessed via args[]

args[] = {"12", "13", "14", "15"}
```

### SCANNER CLASS

To use Scanner we must import the Scanner module from utilies library of default JAVA libraries.  

```
import java.util.*;
//or
import java.util.Scanner;
```  

Now We must declare a Scanner Object  
``` Scanner <any_name> = new Scanner(System.in);```

We have a Host of methods to Scan:  
```nextFloat()``` Floating Values  
```nextDouble()``` Double precision Floating values  
```nextLine()``` Entire  Line including newline   
```next()``` Entire Line till whitespace encountered.

### ReadLine()

we need to import  
```import java.io.*;```

```InputStreamReader obj1 = new InputStreamReader(System.in);```  
```BufferedReader obj2 = new BufferedReader(obj1)```     
        --or--  
```BufferedReader b = new BufferedReader(new InputStreamReader(System.in));```  

we need to include the methods in a try-catch block 
```
try{
    //code
    a = b.readLine();
    //code
    }catch(IOException e){
        System.out.println("Error");
    }
```

or provide a controller in the main function
```
public static void main(String args[]) throws IOException
{
    //body
}
```