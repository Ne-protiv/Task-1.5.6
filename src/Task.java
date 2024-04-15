public class Task {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 4, 91, 5, 10, 11};
        int[] result = inverseArray(numbers);
        System.out.print("[");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1] + "]");
    }

    public static int[] inverseArray(int[] numbers) {
        int lengthOfMassive = numbers.length;
        int[] result = new int[lengthOfMassive];
        for (int i = 0; i < numbers.length ; i++) {
            result[lengthOfMassive - 1] = numbers[i];
            lengthOfMassive--;
        }
        return result;
    }
}
