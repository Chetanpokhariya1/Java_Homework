import java.util.*;
public class Problem2 {
    String Firstname="Chetan";
    String Lastname="Pokhariya";
    public static void main(String[] args) {
        Problem2 obj=new Problem2();
        obj.printName();
        int sum =obj.addNumber();
        System.out.println(sum);

    }
    public void printName(){
        System.out.println("My Name Is "+Firstname+" "+Lastname );
    }
    public int addNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter num1:");
        int num1= sc.nextInt();
        System.out.print("enter num2:");
        int num2= sc.nextInt();
        int sum=num1+num2;
       return sum;


    }

    }

