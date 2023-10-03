# STRING CLASS

* belongs to  ```java.lang``` package so there is no need to import any module/library

* The constructor of String  class are
```java
String()

String(char char[])

String(String)

String(byte b[])
```

______

**String() contructor**
```java
String ob = new String();
```
a string of ```NULL``` type is created


```java
char[] = n = new n[5];
for(int i= 0; i< 5; i++)
{
    n[i] = sc.next.charAt(0);
}
```

**String(String) Construtor**
```java
String S1 = new String("abc");
String S2 = "abc";
String S3 = new String("abc");
```

here whene a variable **"abc"** is once created then java check the memory for the extence of literal **"abc"** when creating **s2** and it assign the address of **"abc"** to variable **s2**.   
In Order to create a new memory space we use the new symbol.

### COMPARING STRINGS


```boolean equals(String)``` : A method equals is used to compare strings in JAVA

```java
String s1 = "Abcd";
String s3 = new String("Abc");
if (s1.equals(s3)){
    System.out.println("Equal");
}else{
    System.out.println("Not Equal");
}
```

### METHODS IN STRING CLASS
1. ```int length()``` : returns the elngth of the string  
>  **EXAMPLE**
>  ```java
>  String s1 = "Abc";
>  System.out.println(s1.length());
> ```

2. ```char charAt(int index)``` : returns the character at the given index (0-indexed index).

3. ```String SubString(int index)``` : returns a part of the given string.
> ```java
> String s1 = "Odisha";
> System.out.println(s1.SubString(3));
> //"sha"
> ```

4. ```String concat(String str)``` : returns string 1 combined with string 2

5. ```int indexOf(String s)``` : returns the index of the element in string object.

6. ```boolean equals(Object obj)```: It is used to compare two strings.
> object class is super class of all other classes in JAVA
7. ```String toLowecase()``` : Convert String to lowercase
8. ```String toUpperCase()``` : Convert String to uppercase
9. ```int CompareTo(String s)``` :
10. ```String trim()``` : use to remove leading and trailing white spaces in the String  

**IMP**
> What is the different between equals and CompareTo methods?

11. ```String replace(char oldchar, char newchar)``` :
12. ```String Contains(String)```
> ```java
> String ob1 = "Odisha";
> String ob2 = "Od";
> ob1.Contains(ob2);
>```

**IMP**
> String Types are immutable   

when you try to make any changes to an existing string, a new String is created.

In order to avoid the unecessary wastage of memory and immutability of String Class StringBuffer Class was introduced.

## StringBuffer Class

* It belongs to ```java.lang``` package and implements charSequence and Serialisable interfaces.
* Any Changes in Existing String discards the old one and creates a new one.
* StringBuffer objects are auto flushed.
* Used for Dynamic String Concatenation
* Safe to be Used by Multiple Threads using ```synchronised``` keyword.
* objects are mutable and operation are faster than String class.

## Constructor

```StringBuffer()```

```StringBuffer(String)```

```StringBuffer(int Capacity)```

## Methods
```public synchronised int length()```

```public synchronised int Capacity()```

```public synchronised void SetLength(int length)```

```public synchronised char CharAt(int index)```

```public synchronised getChars(int start, int end, char c[], int index)```

```public synchronised SetCharAt(int index, char ch)```

```public synchronised StringBuffer append(Object ob)```

```public synchronised StringBuffer append(String s)```

```public synchronised StringBuffer(StringBuffer s)```

```public synchronised StringBuffer(char c)```
