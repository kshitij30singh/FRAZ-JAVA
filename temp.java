import java.util.Scanner;
class temp{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        double tempInFeh = in.nextDouble();

        double tempInCel = ((tempInFeh - 32)* 5.0)/9.0;
        System.out.println("Temperate in celsius = " + tempInCel);
    }
}