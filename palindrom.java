import java.util.Scanner;

class palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0;
        
        int x = n;

        while(x > 0)
        {
        
        
        int lastdigit = x % 10;
        rev = rev * 10 + lastdigit;
        x= x/10;
        }

        if (n==rev)
        {
            System.out.println("Palindrom");
        }
else {
System.out.println("Not Palindrom");
}
    }
}