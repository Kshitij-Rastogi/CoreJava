## Problem Statement - Pascal's Triangle

In this challenge, you need to debug a function which is supposed to print a passcals triangle in a given range. For example, for a pascal triangle of five rows, it will look like the following:

```
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
```



The buggy code is as following:

```java
public class PascalsTriangle {

    public static void main(String[] args) {
        int no_of_row,c=1;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_of_row = in.nextInt();
        for(int i=0;i<no_of_row;i++)
        {
        for(int b=1;b<=no_of_row-i;b++)
        System.out.print(" ");
        
        for(int j=0;j<=i;j++)

        if (j==0||i==0)
        c=1;
        else
        c=c*(i-j+1)/j;
        System.out.print(" "+c);

        System.out.print("\n");
        }
    }
}

```

