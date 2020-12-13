import java.util.Scanner;
public class FindingFibonacciSeries{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
        sc.close();
    }

    public static void fibonacci(int n) {
        if(n<1) {
            System.out.println(0);
        }
        int sum = 0;
        int a = -1;
        int b = 1;
        for (int i=0;i<n;i++) {
            sum = a+b;
            a = b;
            b = sum;
            System.out.print(sum + " ");
        }
    }
}