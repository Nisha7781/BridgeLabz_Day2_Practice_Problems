import java.util.Scanner;

class NaturalSumForLoop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        
        for(i=1; i<=n; i++)
        {
            sum = sum + i;

        }

        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
}
