import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int score = input.nextInt();

      if (score % 3 > 90)
        System.out.println(score + "is even.");
        else 
        System.out.println(score + "is odd.");
    }
}
