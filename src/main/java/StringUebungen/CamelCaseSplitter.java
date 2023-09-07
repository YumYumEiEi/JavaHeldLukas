package StringUebungen;

import Util.ConsolReader;

public class CamelCaseSplitter {
    public static void go() {
        System.out.println("Gib einen Camelcase String ein!");
        String camelCase = ConsolReader.readString();

        System.out.println(splitCamelcase(camelCase));
    }

    private static String splitCamelcase(String camelCase) {
        StringBuilder newString = new StringBuilder(camelCase.substring(0, 1));
        for (int index = 1; index < camelCase.length(); index++) {
            char letter = camelCase.charAt(index);
            if (Character.isUpperCase(letter)) {
                char lastLetter = camelCase.charAt(index - 1);
                if (Character.isLowerCase(lastLetter)) {
                    newString.append(" ").append(camelCase.charAt(index));
                } else {
                    char nextLetter = camelCase.charAt(index + 1);
                    if (Character.isLowerCase(nextLetter)) {
                        newString.append(" ").append(camelCase.charAt(index));
                    } else {
                        newString.append(camelCase.charAt(index));
                    }
                }
            } else {
                newString.append(camelCase.charAt(index));
            }
        }
        return newString.toString();
    }
}
