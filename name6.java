import java.util.Scanner;

public class name6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i = i+2)

        sum = sum + i;

        System.out.println("Sum of odd numbers:" + sum);
        

        }
    }
    

