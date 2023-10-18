# EXCEPTION HANDLING(cont)

* each try block can be followed by multiple catch blocks
```java
try
{
    //exception throwing body
}
catch (exception_name obj)
{
    //to do
}
catch (ecpetion_name obj)
{
    //to do
}
```

* finally block conatines the statements relating to some necessary operations required to be done at the end of pogram execution.  
* The contents of infally block is executed even if there is no exception arising at the tme of program execution.

```java
try{
    //body
}
finally{
    //body
}
```
<br/>

> **VIMP**  
> What is the difference between final, finally and finalize()

<br/>

```java
//used to declare the constant variable
final int a; //const int a;

//classes are not allowed to inherit
final class{
    //body
}

//function have fixed description
final void method_name(){
    //body
}
```

> **VVIMP**  
> what is difference between ```throw``` and ```throws```

* as the name indicates both the keywords are used for throwing exceptions created during program execution.
* throw is used inside method body whereas throws is used in method signature.

```java
import java.io.*;

public class X
{
    public static void main() throws IOExcpetion
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

    }
}
```

```java
char a = 'A';
if(a != 'A'){
    throw ob;
}
//where ob is object of exception class

```


```java
///try with multiple ctch```