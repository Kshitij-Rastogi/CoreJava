## Problem Statement - Sorting an array

In this challenge, you will need to debug a function which is supposed to sort a list of integer values in ascending order. The buggy code is as following:

```java
public static void sort(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length; i++) {
            for(int j=i;j<arr.length;j++) {
                if(arr[i]>arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }

        for(int num: arr) {
            System.out.print(num+ " ");
        }
    }
```


