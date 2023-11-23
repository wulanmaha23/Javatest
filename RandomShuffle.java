import java.util.Scanner;

public class RandomShuffle {
    public static void main(String[] args){
        double [] myList = new double[10];
        for(int i=0;i<10;i++)
            myList[i]=i;
        System.out.print("enter " + myList.length + "values ");
        for (int i=0;i<10;i++)
            System.out.println(myList[i]);
        System.out.println("--------------------------");
        for (int i = myList.length - 1; i > 0; i--){ 
            //Generate an index 3 randomly with 0 <= j <= i
            int j = (int)(Math.random() * (i + 1));

            // Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
        for (int i=0;i<10;i++)
            System.out.println(myList[i]);

    }
}