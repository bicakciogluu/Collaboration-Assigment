public class Colaboration {
    public static int evenSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length / 2; i++) {
            result += array[2 * i + 1];
        }
        return result;
    }

    public static int oddSum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length / 2.0; i++) {
            result += array[2 * i];
        }
        return result;
    }
}