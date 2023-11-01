import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("enter first number");
        int num1 = num.nextInt();
        System.out.print("enter second number");
        int num2 = num.nextInt();
        System.out.print("enter third number");
        int num3 = num.nextInt();
        if (num1 > num2) {
            System.out.println(num1+"is greatest");
            if (num2 > num1) {
                System.out.println(num2 + "is greatest");
            }
            if (num2>num3){
                System.out.println(num2 + "is greatest");
            }
            if (num3>num2){
                System.out.println(num3 + "is greatest");
            }
                else{
                    System.out.println(num1 + "is greatest");
                }
            }

        }
    }
