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







    }
}