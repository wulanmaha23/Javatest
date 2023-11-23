import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int t = 1;
        int gcd = 1;
        int count = 0;
        while (t != 0) {
            int temp;
            if (a < b) {
                temp = a;
                a = b;
                b = temp;
            }
            t = a % b;
            if (t != 0) {
                a = t;
                gcd = t;
            }
            count++;
        }

        System.out.println("gcd:" + gcd);
        System.out.println("total times is:" + count);
    }
}