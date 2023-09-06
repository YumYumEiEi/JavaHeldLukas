import Util.ConsolReader;

public class ArraySplitter {

    public static void go() {
        System.out.println("Wie viele stellen soll das Array haben?");
        int length = ConsolReader.readInt();
        int[] numbers = new int[length];
        ArrayDreher.fillNumbersArray(numbers);
        System.out.println(findTheSplit(numbers, numbers.length / 2));
    }

    private static int findTheSplit(int[] numbers, int split) {
        if (split == 0 || split == numbers.length) {
            return -1;
        }
        int left = 0;
        int right = 0;
        for (int index = 0; index < split; index++) {
            left += numbers[index];
        }
        for (int index = numbers.length - 1; index >= split; index--) {
            right += numbers[index];
        }
        if (isGoodSplit(left, right)) {
            return split;
        } else {
            split = left < right ? split + 1 : split - 1;
            return findTheSplit(numbers, split);
        }
    }

    private static boolean isGoodSplit(int left, int right) {
        if (left == right) {
            return true;
        }
        int absoluteDifference = Math.abs(left - right);
        int percentage = (int) (100. * absoluteDifference / Math.max(left, right));
        return percentage <= 10;
    }
}
