## Problem Statement - Finding Fibonacci Series

The Fibonacci numbers are the numbers in the following integer sequence.
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation

Fn = F<sub>n-1</sub> + F<sub>n-2</sub>

with seed values

   F<sub>0</sub> = 0 and F<sub>1</sub> = 1.

For example, 
```
0 + 1 = 1

1 + 1 = 2

1 + 2 = 3

2 + 3 = 5

5 + 8 = 13
```

In this challenge, you need to correct the function which is supposed to correct find the first `n` fibonacci numbers. 

```java
 public static int fibonacci(int n) {
        if(n<1) {
            return 0;
        }
        int sum = 0;
        
        int a = 1;
        int b = 1;


        for (int i=0;i<n;i++) {
            a = sum;
            sum+=b;
            b=a;
        }

        return sum;
    }

```
