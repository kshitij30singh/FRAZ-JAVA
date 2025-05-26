import java.util.Scanner;

class file {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n >= 4 && n%2 == 0)
        {

            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}