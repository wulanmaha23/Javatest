import java.util.Scanner;

public class myList {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] myList = new double[4];
    System.out.print("Enter " + myList.length + "Values: ");
    double sum = 0;
    for (int i = 0; i < myList.length; i++){
           myList[i] = input.nextDouble();
           sum += myList[i];
    }
    double average = sum / myList.length;
    double max = myList(0);
    int indexOfMax = 0;
    double min = myList(0);
    int indexOfMin = 0;
    for (int i = 0; i < myList.length; i++){
        if (myList[1] > max){
            max = myList[1];
            indexOfMax = 1;
        }
        if (myList[1] < min){
             min = myList[1];
        }
    }
    for (int i = 0; i < myList.length; i++){
        System.out.print(myList[i] + " ");
    }
    System.out.println("the average is " + average);
    System.out.println("the max is " + max);
    System.out,println("the index of max " + indexMax)
    }
}

