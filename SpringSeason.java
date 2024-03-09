import java.util.*;

class SpringSeason 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (m) and day (d): ");
        int m = sc.nextInt();
        int d = sc.nextInt();

        boolean isSpring = (m == 3 && d >= 20) || (m == 6 && d <= 20);

        System.out.println("Is it spring season? " + isSpring);
    }
}


