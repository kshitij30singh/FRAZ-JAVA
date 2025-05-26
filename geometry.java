import java.util.Scanner;

class geometry{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int b = sc.nextInt();

        int area = l * b;
        int perimeter = 2 * ( l + b);
        System.out.println("Perimeter = " + perimeter); 
        System.out.println("Area = " + area);
    }
}