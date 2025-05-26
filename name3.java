import java.util.Scanner;

public class name3 {
    
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0)
        {
            System.out.println("Number is divisible by both 5 and 11");
        }
        else{
            System.out.println("Number is not divisible by both 5 and 11");
        }
    }
}
