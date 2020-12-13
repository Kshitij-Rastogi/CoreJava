import java.util.Scanner;
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

        if (j==0||j==i)
        {
            c=1;
            System.out.print(" "+c);
        }
        else{
            c=c*(i-j+1)/j;
            System.out.print(" "+c);
        }
        System.out.print("\n");
        }
    }
}