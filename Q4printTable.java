import java.util.Scanner;

public class Q4printTable {

    interface MathOperation {
        int multiply(int a);
    }
   private  void printtable(int n) {

       int i=1;
       Q4printTable pt=new Q4printTable();
       MathOperation multiplication = (int a) -> a * n;
       System.out.format("Table of %d \n",n);
       while(i<=10) {
           System.out.format("%d X %d = ",n,i);
           System.out.println(pt.operate(i, multiplication));
           i++;
       }
   }

    private int operate(int a, MathOperation m) {
        return m.multiply(a);
    }


    public static void main(String[] args) {
        Q4printTable pt=new Q4printTable();
        int num=0;
        System.out.println("Enter the Number whose table you want to print");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        pt.printtable(num);

    }
}
