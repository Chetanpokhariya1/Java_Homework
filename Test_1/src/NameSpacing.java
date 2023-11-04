import java.util.*;

public class NameSpacing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=sc.next();
        for (int i=0;i<name.length();i++){
            System.out.print(" "+name.charAt(i));
        }


    }
}
