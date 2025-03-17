import java.util.Random;
import java.util.Scanner;

class Lab9_getArrayed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // task 1
        int[] dataPoints = new int[100];

        // task 2
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // task 3
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + (i < dataPoints.length - 1 ? " | " : "\n"));
        }

        // task 4
        int sum = 0;
        for (int num : dataPoints) {
            sum += num;
        }
        double average = sum / 100.0;
        System.out.println("the sum of the array is: " + sum);
        System.out.println("the average of the array is: " + average);

        // task 5
        int userValue = SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);

        // task 6
        int count = 0;
        for (int num : dataPoints) {
            if (num == userValue) {
                count++;


            }
        }
    }
}