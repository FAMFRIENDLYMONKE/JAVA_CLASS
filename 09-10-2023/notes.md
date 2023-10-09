# CHARACTER CLASS
> **VIMP**  
> what is the need to convert primitive data to objects? 

Ans:  
* Security
* Some methods only accept parameters as object
* representation of data in proper way so that the target can be reahed easily.

### Constructor
```java
Character(char)
```

### METHOD
1. ```public static Character ValueOf(char)``` : char to Character Conversion
2. ```public static char CharValue(Character)``` : Character to char Conversion
3. ```public static int hashCode():```: Value of first element
4. ```public static String toString(char)```: char to String


# BOOLEAN CLASS
### CONSTRUCTOR
```java
Boolean(boolean)
 // or //
Boolean(String)
```

**EXAMPLE**
```java
Boolean abc = new Boolean("true");

Boolean abc = new Boolean(0) //false;
```

### METHODS
``` java
public static boolean parseBoolean(String); //String to boolean

public static boolean boooleanValue(); // boolean 

public static String toString(boolean); //String from boolean

public int hashCode();

public static Boolean valueOf(String);

public static Boolean valueOf(boolean);
```


# BYTE CLASS

> **IMP**   
> Write a note on Wrapper Classes (long Question)  

Ans: * Write 5-6 lines about each wrapper class, constructor and its methods

### CONSTRUCTOR
```java
Byte(byte)

Byte(String) //input should be of small size and written within double quotes
```

### METHODS
```java
public static byte parseByte(String); //String to Byte


public static Byte valueOf(String); //Byte from String

public static Byte valueOf(byte);

public static int hashCode();

public static String toString(byte); 
```

