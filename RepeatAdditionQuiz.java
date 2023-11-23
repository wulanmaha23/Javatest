import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print(
                "What is " + number1 + "+" + number2 + "?");
        int answer = input.nextInt();

        int i = 0;

        while ((number1 + number2 != answer) && i < 3) {
            System.out.print("Wrong answer. Try again. What is" + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            i++;
        }
        if (i < 3)

            System.out.println("You got it!");
        else
            System.out.println("Greater than 3 times wrong!");
    }

}
