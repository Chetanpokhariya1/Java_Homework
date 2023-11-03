import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        //    For 1 to 50 units – 30Rs/unit
//    For 50 to 100 units – 35Rs/unit
//    For 100 to 150 units – 40Rs/unit
//    For 150 units and above – 50Rs/unit
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the unit:");
        int unit=sc.nextInt();
        if (unit<=50) {
            int bill = 30 * unit;
            System.out.println("The Electricity bill is " + bill);


            if (unit <= 100 && unit > 50) {
                int bill1 = 35 * unit;
                System.out.println("The Electricity bill is " + bill1 + bill);

                if (unit <= 150 && unit > 100) {
                    int bill2 = 40 * unit;
                    System.out.println("The Electricity bill is " + bill2 + bill1 + bill);

                    if (unit > 150) {
                        int bill3 = 50 * unit;
                        System.out.println("The Electricity bill is " + bill3 + bill2 + bill1 + bill);
                    }


                }
            }
        }
    }
}
