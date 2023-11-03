import java.util.Scanner;

public class Sum_of_N_Terms {
    public static void main(String[] args) {
        Scanner num1=new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int num= num1.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("sum of "+ num+ " term is " + sum);
    }
}