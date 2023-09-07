package StringUebungen;

import Util.ConsolReader;

public class WhitespaceClearer {
    public static void go(){
        System.out.println("Gib einen String ein!");
        StringBuilder string = new StringBuilder(ConsolReader.readString());

        System.out.println(clearWhiteSpaces(string));
    }

    private static String clearWhiteSpaces(StringBuilder string) {
        while (string.indexOf("  ") != -1){
            int indexOfWhitespace = string.indexOf("  ");
            string.deleteCharAt(indexOfWhitespace);
        }
        return string.toString();
    }
}
