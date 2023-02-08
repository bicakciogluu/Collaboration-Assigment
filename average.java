
public class average {

    private static int sum = 0;
    private static int average;
    // Find an average

    public static int getAverage(int[] array) {
        for (int element : array) {
            sum += element;
        }
        average = sum / array.length;
        return average;
    }

    public static int[] getNewArray(int[] array) {
        sum = 0;
        // Average
        for (int element : array) {
            sum += element;
        }
        average = sum / array.length;

        int[] new_array = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i] - average;
        }
        return new_array;
    }
}