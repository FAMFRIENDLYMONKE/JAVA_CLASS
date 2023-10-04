# StringBuffer Methods (contd.)

* ```public synchronized StringBuffer delete(int index, int lenght);```
* ```public synchronized StringBuffer deleteCharAt(int index)```
* ```public synchronised StringBuffer replace(int index, int length, String s)```
* ```public synchronised StringBuffer insert (int index, String s)```
* ```public synchronised StringBuffer reverse()```
* ```public String toString()```

> **EXAMPLE**
> 
> ```java
> StringBuffer s1 = "abc"; //stringbuffer coantining a string
> StringBufer s2 = new StringBuffer("abc"); //new StringBuffer object containing String
> s3 = s1.toString(); //String type
> ```

## StringTokenizer Class

> It is used to convert the given String into a Set of tokens with the help of delimiters (space, comma, etc)

* It doesnot provide the facility to differentiate between numbers ,quoted Strings and identifiers

### CONSTRUCTORS OF STRINGTOKENIZER CLASS

* ```StringTokenizer(String s)```
* ```StringTokenizer(String a, String delimiter)```

### METHODS INSIDE StringTokenizer Class

* ```boolean hasMoreToken()```: Used to check if there are more tokens or not
* ```String nextToken(String delimiter)``` : Returns the next Token
> default delimiter is whitespace " "  
* ```int CountToken()``` : returns the total count of tokens


# WRAPPER CLASSES

All the classes belonging to wrapper classes are contained to ```java.lang ``` package.  
As **JAVA** handles everything in the form of object it is necessary to convert the primite data type data to classtype  and vice-versa.

**IMP** autoboxing and unboxing


```text
Primitive Type ---------> Corresponding Class
int                         Integer
String                      String
byte                        Byte
boolean                     Boolean
float                       Float
double                      Double
char                        Character
```

### AUTOBOXING

> Conversion from primitive type data to corresponding Class Type is done automatically in cas of Autoboxing
  
**EXAMPLE**
```java
Integer a = 6; //here a is an object not a variable
Integer a = new Integer(5);
```

### UNBOXING
> It is the process of converting class type data to primitive type Data.


* Java classes are useful in Collections, serialisation and synchronisation.

**SERIALISATION**
> The proper seiral order of execution of the process of data is known as Serialization

## INTEGER CLASS
* ```Integer(int)```
* ```Integer(String)```
* ```static int MAX_VALUE``` : 2^31 - 1
* ```static int MIN_VALUE``` : - 2^31

**METHODS**
* ```static int bitCount(int t)``` : no of bits in integer
* ```static int CompareTo(Integer ob)``` : Comparison
* ```static Integer ValueOf(int ob)``` : int to Integer Conversion
* ```static Integer ValueOf(String s)``` : String to Integer Conversion
* ```static String toString()``` : Integer to String Conversion.
* ```static String toString(int a)```: int to String
* ```static int parseInt(String s)```: used to convert String to s
* ```static int reverse(int) a```: The number is returned in 2 complement form in decimal form
* ```static int numberofleadingzeroes()```: 
* ```int hashCode()```