import java.util.Scanner;

public class testlove {
    public static void main(String[] args) {
        String str = "Do you still love me?";
        Scanner input = new Scanner(System.in);
        System.out.println(str);
        String str2 = input.next();
        str2 = str2.toUpperCase();
        if (str2.equals("OK")) {
            System.out.println("Good");
        } else
            System.out.println("ops...");
    }
}