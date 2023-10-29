public class Findnaturalnumber {
    public static void main(String[] args) {
        int factor=0;
        int num1=16;
        for (int i=1;i<=num1;i++){
            if (num1%i==0){
                factor++;
            }
        }
        if (factor==2) {
            System.out.println("prime number");
        }
            else{
                System.out.println("composite number");
            }
        }
    }

