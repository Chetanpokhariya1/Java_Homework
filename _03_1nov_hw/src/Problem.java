import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the unit");
        int unit= obj.nextInt();
        for (unit=1;unit<=50;unit++){
            System.out.println("The electricity bill is"+30*unit);
        }
        for (unit=50;unit<=100;unit++){
            System.out.println("The electricity bill is"+35*unit);
        }
        for (unit=100;unit<=150;unit++){
            System.out.println("The electricity bill is"+40*unit);

        }
        if (unit>150){
            System.out.println("The electricity bill is"+50*unit);
        }

    }
}
