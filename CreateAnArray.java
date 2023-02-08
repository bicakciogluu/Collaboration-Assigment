import java.util.Random;
import java.util.Scanner;


public class CreateAnArray {
    public static int[] createArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an array lenght: ");
        Random random = new Random();
        int lengthOfArray = in.nextInt(); 
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] array = createArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
