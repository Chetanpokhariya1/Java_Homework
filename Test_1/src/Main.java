import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter second number:");
        int num2=sc.nextInt();
        System.out.print("Enter third number:");
        int num3=sc.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println(num1+ " is smallest");
            if (num2<num3){
                System.out.println(num2+" is neither smallest nor greatest");
                System.out.println(num3+" is greatest");
            }
            else {
                System.out.println(num3+" is neither smallest nor greatest");
                System.out.println(num2+" is greatest");
            }
        }
        if (num2<num1 && num2<num3){
            System.out.println(num2+" is smallest");
            if (num1<num3){
                System.out.println(num1+" is neither smallest nor greatest");
                System.out.println(num3+" is greatest");
            }
            else {
                System.out.println(num3+" is neither smallest nor greatest");
                System.out.println(num1+" is greatest");
            }

        }
        if (num3<num1 && num3<num2){
            System.out.println(num3+" is smallest");
            if (num2<num1){
                System.out.println(num2+" is neither smallest nor greatest");
                System.out.println(num1+" is greatest");
            }
            else {
                System.out.println(num1+" is neither smallest nor greatest");
                System.out.println(num2+" is greatest");
            }
        }
        if (num1==num2 && num2==num3){
            System.out.println("all numbers are same");
        }
        if (num1==num2 && num2<num3){
            System.out.println(num3+" is greatest");
            System.out.println(num2 +" is smallest");
        }
        if (num2==num3 && num3<num1){
            System.out.println(num1+"is greatest");
            System.out.println(num3 +" is smallest");
        }
        if (num3==num1 && num1<num2){
            System.out.println(num2+" is greatest");
            System.out.println(num3 +" is smallest");
        }
    }

}
