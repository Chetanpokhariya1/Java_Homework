import java.util.Scanner;
public class SumOfNTerms {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number of terms");
        int num = obj.nextInt();
        int res = 0;
        for(int i=1; i<=num; i++){
            res+=i;
        }
        System.out.println(res);


    }
}
