import java.sql.SQLOutput;
import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {

    int[] myArray = {3,4,5,7,8};

        System.out.println("First element is :" + myArray[0]);
        System.out.println("Middle element is :" + myArray[myArray.length%2+1]);
        System.out.println("Last element is :" + myArray[myArray.length -1]);

        double[] newArray = {Math.random(), Math.random(),Math.random(),Math.random(),Math.random()};
            for (double i : newArray) {
            System.out.println(i);
        }
        double sum = 0;
            for (double i: newArray) {
            sum += i;
        }
        System.out.println("The sum of array is: " + sum);

            Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first element in array: " + scanner);
        double[] zzzArray = {Math.random(), Math.random(),Math.random(),Math.random(),Math.random()};

    }

}
