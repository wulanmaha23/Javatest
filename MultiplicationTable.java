import java.util.Scanner;

public class MultiplicationTable {
    /** Main method */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println(" Multiplication Table");

        // Display the number title
        System.out.print(" ");
        double total = 0.0;
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");
            double sum = 0.0;
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf(i + "*" + j + "%4d\t", i * j);
                sum += (i * j);
            }
            System.out.println(sum);
            total += sum;
        }
        System.out.println("total:" + total);
    }

}
