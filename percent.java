import java.util.Scanner;
class percent{
    public static void main(String[] args){

        Scanner in = new Scanner( System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int sum = (a + b + c + d + e  );
        double average = sum/5;

        System.out.println("Total sum =" + sum);
        System.out.println("Average =" + average);
        System.out.println("Percentage =" + average);
     }
}
     

     
