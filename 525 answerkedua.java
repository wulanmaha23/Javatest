import java.util.Scanner;

public class test2 {
public static void main(String[] args){
    int i = 0, sum = 0;
    while (i < 4) {
        if (i % 3 == 0) continue;
        sum += i;
        i++;
    }
    System.out.println("The sum is" + sum);
    }
}