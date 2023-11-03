import java.util.Scanner;
public class Hcf_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int num1=sc.nextInt();
        System.out.print("enter second number");
        int num2=sc.nextInt();
        int hcf=1;
        int smaller;
        if (num1>num2) {
            smaller = num1;
        }
        else {
            smaller = num2;
        }
        for(int i=1; i<smaller; i++){
            if(num1%i == 0 && num2%i == 0) {
                hcf = i;
            }

        }            System.out.println(hcf);
    }
}





