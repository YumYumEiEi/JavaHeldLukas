package StringUebungen;

import Util.ConsolReader;

import java.util.Arrays;

public class MainClass {
    final static int WORD_IN_THE_MIDDLE = 1;
    final static int DIAMOND_BUILDER = 2;
    final static int DIGIT_SUM = 3;
    final static int BOOK_STRING_REORGANIZE = 4;
    final static int FLOWER_POWER = 5;
    final static int REPEATING_STRING = 6;
    final static int SPACE_FOR_STRINGS = 7;
    final static int CLEAR_WHITESPACE = 8;
    final static int CAMEL_CASE_SPLITTER = 9;
    final static int CESAR = 10;

    public static void main(String[] args) {
        System.out.println("""
                1: Word in the middle test
                2: Diamond-builder
                3: Digit sum
                4: Book String reorganisation
                5: Flower Power
                6: Repeating Strings
                7: Space for Strings
                8: Clear the white space
                9: Camelcase splitting
                10: Cesar cryptic
                """);

        int selection = ConsolReader.readInt();
        switch (selection) {
            case WORD_IN_THE_MIDDLE -> WordInTheMiddleChecker.go();
            case DIAMOND_BUILDER -> DiamondBuilder.go();
            case DIGIT_SUM -> DigitSum.go();
            case BOOK_STRING_REORGANIZE -> BookStringReorganizer.go();
            case FLOWER_POWER -> FlowerPower.go();
            case REPEATING_STRING -> RepeatFinder.go();
            case SPACE_FOR_STRINGS -> StringSpaceMaker.go();
            case CLEAR_WHITESPACE -> WhitespaceClearer.go();
            case CAMEL_CASE_SPLITTER -> CamelCaseSplitter.go();
            case CESAR -> CesarCrypticFun.go();
        }


    }
}
