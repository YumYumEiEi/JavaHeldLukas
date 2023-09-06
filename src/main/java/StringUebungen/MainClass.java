package StringUebungen;

import Util.ConsolReader;

public class MainClass {
    final static int WORD_IN_THE_MIDDLE = 1;
    final static int DIAMOND_BUILDER = 2;
    public static void main(String[] args) {
        System.out.println(
                "1: Word in the middle test\n" +
                "2: Diamond Builder\n");
        int selection = ConsolReader.readInt();
        switch (selection){
            case WORD_IN_THE_MIDDLE -> WordInTheMiddleChecker.go();
            case DIAMOND_BUILDER -> DiamondBuilder.go();
        }


    }
}
