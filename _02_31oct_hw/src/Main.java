import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 =obj.nextInt();
        System.out.println("enter second number:");
        int num2 =obj.nextInt();
        int hcf = 1;

        int smallerNumber;

        if(num1>num2){
            smallerNumber = num2;
        }else{
            smallerNumber = num1;
        }

        for(int i=1; i<smallerNumber; i++){
            if(num1%i == 0 && num2%i == 0){
                hcf=4;
            }
        }
        System.out.println(hcf);

    }

}