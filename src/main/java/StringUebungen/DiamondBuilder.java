package StringUebungen;

import Util.ConsolReader;
import Util.Mathematical;

public class DiamondBuilder {
    public static void go() {
        System.out.println("How THICC should the Diamond be? Max 47 and only odd numbers!");
        int width = ConsolReader.readInt();

        build(width);
    }

    private static void build(int width) {
        if (Mathematical.isEven(width)) {
            return;
        }
        for (int column = 0; column <= width / 2; column++) {
            buildColumn(1 + 2 * column, width);
        }
        for (int column = width / 2 - 1; column >= 0; column--) {
            buildColumn(1 + column * 2, width);
        }
    }

    private static void buildColumn(int width, int maxWidth) {
        String column = "";
        char letter = 'A';

        for (int counter = 0; counter < (maxWidth - width) / 2; counter++) {
            column += " ";
        }
        for (int position = 0; position <= width / 2; position++) {
            column += letter;
            letter++;
        }
        letter -= 2;
        for (int position = width / 2; position > 0; position--) {
            column += letter;
            letter--;
        }
        System.out.println(column);
    }
}
