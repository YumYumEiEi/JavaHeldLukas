import Util.ConsolReader;

public class Quatrophobia {
    public static void go() {
        System.out.println("Wie viele Zahlen soll das Array enthalten?");
        int length = ConsolReader.readInt();
        int[] numbers = new int[length];
        ArrayDreher.fillNumbersArray(numbers);

        fourToTheBack(numbers);
        printArray(numbers);
    }

    private static void printArray(int[] numbers) {
        for (int number :
                numbers) {
            System.out.print(number + ", ");
        }
    }

    private static void fourToTheBack(int[] numbers) {
        int swapReach = 1;
        for (int index = 0; index < numbers.length; index++) {
            if(index + swapReach < numbers.length && numberHasAFour(numbers[index])){
                int tmp = numbers[index];
                numbers[index]= numbers[index+swapReach];
                numbers[index+swapReach] = tmp;
                if(numberHasAFour(numbers[index])){
                    swapReach++;
                    index--;
                }else{
                    swapReach = 1;
                }
            }
        }
    }

    private static boolean numberHasAFour(int number) {
        while (number > 0){
            if(number%10 == 4){
                return true;
            }else{
                number /= 10;
            }
        }
        return false;
    }
}
