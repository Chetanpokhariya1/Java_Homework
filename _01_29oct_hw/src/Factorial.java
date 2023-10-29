public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        int i=1;
        int factorial = 1;
        for (int i = 1; i<=num-1; i++) {
            factorial=num*i;
            factorial*=i;
            System.out.println(factorial);
        }
        System.out.println(factorial);
    }
}
