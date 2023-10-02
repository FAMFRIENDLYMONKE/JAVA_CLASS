# CONTROL STATEMENTS IN JAVA

There are 3 types of control Starements in JAVA
1. Decisional 
2. Iterative
3. Jump/Transfer Statement

### DECISIONAL
It is of 4 types
1. If
```
if(<test>){
    //body
}
```
2. if else

```
if(<test-condition>){
    //body
}
else{
    ///body
}
```

3. if else if
```
if(<test-condition>){
    //body
}
else if(<text-condition>){
    //body
}
```
4. switch

```
switch(<varible>){
    case <comparison1>:
        //body
        //break;
    case <comparison2>:
        //body
        //break;
    default:
        //default will be executed when no case match
        //no need for break as control exits switch block
}
```

### ITERATIVE

1. Conditional Loop
2. Non Conditional Loop

#### CONDITIONAL LOOP
1. While loop (entry Controlled Loop)
```
while(<test-condition>){
    //body
}
```
2. do While loop (exit controlled loop)
```
while(<test-condition>){
    //body
}
```

#### NON CONDITIONAL LOOP
1. For Loop
```
for(<initialisation>; <condition>; <updation>){
    //body
}
```

### JUMP STATEMENTS
1. ```break```
2. ```continue```
3. ```break label```

### CONDITIONAL OPERATOR
```var = <condition> ? <true_val> : <false_val>;```

