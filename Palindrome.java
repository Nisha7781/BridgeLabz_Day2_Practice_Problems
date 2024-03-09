import java.util.*;

class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        int rev = 0;

        for(; num != 0; num = num /10) 
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        if (original == rev)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is  not palindrome");
        }

    }
}
