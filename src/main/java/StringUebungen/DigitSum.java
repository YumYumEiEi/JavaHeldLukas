package StringUebungen;

import Util.ConsolReader;

public class DigitSum {
    private final static int NUMBER = 1;
    private final static int STRING = 2;
    public static void go(){
        System.out.println("Do you want to test Numbers(1) or Strings(2)?");
        int mode = ConsolReader.readInt();
        switch (mode){
            case NUMBER -> numberDigit();
            case STRING -> stringDigit();
        }
    }

    private static void stringDigit() {
        System.out.println("Type your number!");
        String numberAsString = ConsolReader.readString();
        long number = Long.valueOf(numberAsString);
        System.out.println(getDigitSum(number));
    }

    private static void numberDigit() {
        System.out.println("Type your number!");
        long number = ConsolReader.readLong();
        System.out.println(getDigitSum(number));
    }

    private static long getDigitSum(long number) {
        long result = 0;
        while (number > 0){
            result += number%10;
            number /= 10;
        }
        return result;
    }


}
