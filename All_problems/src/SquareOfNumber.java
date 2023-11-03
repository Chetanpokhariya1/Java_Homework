import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number:");
        int num= sc.nextInt();
       int square=num*num;
        System.out.println(square);
    }
}
