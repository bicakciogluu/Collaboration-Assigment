import java.util.Scanner;

public class omer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select your option: ");
        System.out.println("1- Create an array");
        System.out.println("2- Find min and max of an array");
        System.out.println("3- Find the average of an array");
        System.out.println("4- Display how each element of the array differs from the average");
        System.out.println("5- Find the sum of elements with odd- and even-numbered indexes");
        System.out.println("6- Exit ");
        int option = in.nextInt();
        boolean isDone = false;

        while (!isDone) {
            if (option == 6) {
                System.out.println("Program has finished.");
                isDone = true;
            }
            if (option == 1) {
                int[] newArray = CreateAnArray.createArray();
                for (int i = 0; i < newArray.length - 1; i++) {
                    System.out.print(newArray[i] + ", ");
                }
                System.out.print(newArray[newArray.length - 1]);

            }
        }

    }
}