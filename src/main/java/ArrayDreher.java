import Util.ConsolReader;

public class ArrayDreher {
    public static void go() {
        System.out.println("Geben sie 9 Zahlen ein.");
        int[] numbers = new int[9];
        fillNumbersArray(numbers);
        printArray(numbers);
        turnAround(numbers);
        printArray(numbers);
    }

    private static void turnAround(int[] numbers) {
        for (int index = 0; index < numbers.length / 2; index++) {
            int tmp = numbers[index];
            numbers[index] = numbers[numbers.length-index-1];
            numbers[numbers.length-index-1] = tmp;
        }
    }

    private static void printArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index]);
        }
        System.out.println();
    }

    public static void fillNumbersArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = ConsolReader.readInt();
        }
    }
}
