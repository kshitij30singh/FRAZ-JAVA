import java.util.Scanner;
public class alpha {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println("Enter A Value");
        int value = ch;
        if((value >= 65 && value <= 90) || (value >= 97 && value <= 122))
        {
            System.out.println("It is an Alphabet");

        }
        else{
            System.out.println("It is a digit");
        }
    }
}

