import java.util.Scanner;
class name5{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for ( int i = 2; i <= n; i = i + 2)
    sum = sum + i;
    
    System.out.println("Sum of even numbers:" + sum);
}
}
