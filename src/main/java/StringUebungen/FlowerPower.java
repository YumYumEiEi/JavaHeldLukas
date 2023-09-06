package StringUebungen;

import Util.ConsolReader;

public class FlowerPower {
    private final static String FLOWERS =
            "                _                                                            \n" +
                    "              _(_)_                          wWWWw   _                       \n" +
                    "  @@@@       (_)@(_)   vVVVv     _     @@@@  (___) _(_)_                     \n" +
                    " @@()@@ wWWWw  (_)\\    (___)   _(_)_  @@()@@   Y  (_)@(_)                   \n" +
                    "  @@@@  (___)     `|/    Y    (_)@(_)  @@@@   \\|/   (_)\\                   \n" +
                    "   /      Y       \\|    \\|/    /(_)    \\|      |/      |                  \n" +
                    "\\ |     \\ |/       | / \\ | /  \\|/       |/    \\|      \\|/              \n" +
                    "\\\\|//   \\\\|//   \\\\\\|//\\\\\\|/// \\|///  \\\\\\|//  \\\\|//  \\\\\\|//\n" +
                    "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^";
    private final static int[] FLOWER_BEGINNINGS = new int[]{0, 7, 12, 21, 29, 37, 44, 49};
    private final static int[] FLOWER_LENGTH = new int[]{7, 6, 9, 7, 8, 8, 5, 9};

    public static void go() {
        String[][] flowerSelection = new String[8][9];
        cutFlowers(flowerSelection);
        System.out.println("Schreibe eine zusammenhängende Zahlenfolge!");
        String flowerString = ConsolReader.readString();

        printFlowers(flowerString, flowerSelection);

    }

    private static void printFlowers(String flowerString, String[][] flowerSelection) {
        String[] selectedFlowers = new String[]{"", "", "", "", "", "", "", "", ""};
        for (int flower = 0; flower < flowerString.length(); flower++) {
            printFlower(flowerString.charAt(flower), flowerSelection, selectedFlowers);
        }
        for (String line : selectedFlowers) {
            System.out.println(line);
        }
    }

    private static void printFlower(char flowerChar, String[][] flowerSelection, String[] selectedFlowers) {
        int flower = Character.getNumericValue(flowerChar) - 1;
        if(flower >=  8 || flower < 0){
            flower = 0;
        }
        for (int line = 0; line < flowerSelection[flower].length; line++) {
            selectedFlowers[line] += flowerSelection[flower][line];
        }
    }

    private static void cutFlowers(String[][] flowerSelection) {
        String[] flowerLines = FLOWERS.split("\n");
        for (int flower = 0; flower < 8; flower++) {
            for (int line = 0; line < 9; line++) {
                flowerSelection[flower][line] =
                        flowerLines[line].substring(FLOWER_BEGINNINGS[flower], FLOWER_BEGINNINGS[flower] + FLOWER_LENGTH[flower]);
            }
        }
    }
}
