import java.util.Scanner;

public class answer525 {
public static void main(String[] args){
    int sum = 0;
    for (int i = 0; i < 4; i++){
        if (i % 3 == 0) continue;
        sum += i;
    }
    System.out.println("The sum is" + sum);
    }
}