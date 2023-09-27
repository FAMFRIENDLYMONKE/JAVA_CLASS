# FUNCTION IN JAVA
**WHY FUNCTIONS ?**
1. To Allow us to solve complex problems
2. Hide low level details that otherwise might be confusing.
3. To reuse portion of code.

### DEFINITION OF A METHOD

```
[access-specifier] [modifier] return-type method-name(parameter list)
{
    //body of the method
}
```

**Access Specifier**  
> can be either **public**, **private**, **protected**. Default behaviour is **friendly** (not a keyword in JAVA).

**Modifier**  
> can be one of:  
> **final**, **native**, **synchronoised**, **transient**, **volatile**.  
> final means the functionality defined inside the method will never change during the course.

**Return Type**
> Can be void or valid data type or class type in JAVA

**Method Name**
> has to be a valid JAVA identifier:  
> 1. contains alphabets, digits, _ underscore, $ dollar and can be of any length
> 2. must not be a keyword or Boolean literal or null literal
> 3. Must not begin with a digit
> 4. Java is case sensitive.

----


# CREATING OBJECTS IN JAVA

**Syntax**
```
class_name object_name = new class_name();
```

**new** = it is a keyword used to allocate memory to the object

When there is no constructor declared explicity by the programmer then JAVA JVm crates a Constructor by Default.