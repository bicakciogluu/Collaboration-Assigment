import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class omer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDone = false;
        int[] newArray = CreateAnArray.createArray();
        for (int i = 0; i < newArray.length - 1; i++) {
            System.out.print(newArray[i] + ", ");
        }
        System.out.println(newArray[newArray.length - 1]);

        while (!isDone) {
            System.out.println("Please select your option: ");
            System.out.println("1- Find min and max of an array");
            System.out.println("2- Find the average of an array");
            System.out.println("3- Display how each element of the array differs from the average");
            System.out.println("4- Find the sum of elements with odd- and even-numbered indexes");
            System.out.println("5- Exit ");
            int option = in.nextInt();
            if (option == 6) {
                System.out.println("Program has finished.");
                isDone = true;
            } else if (option == 1) {
                System.out.println("Min value in array: " + assignment.findMin(newArray));
                System.out.println("Max value in array: " + assignment.findMax(newArray));

            }
        }

    }
}