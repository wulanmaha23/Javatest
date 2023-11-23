import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        System.out.println(" Multiplication Table");
        System.out.println(" ");
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("i=" + i + "\t");
            for (int j = 0; j < i; j++) {
                count++;
                System.out.print(count + "\t");
            }
            System.out.println();
        }

        System.out.println("total:" + count);
    }
}
