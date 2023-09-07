package StringUebungen;

import Util.ConsolReader;

public class CesarCrypticFun {
    public static void go() {
        System.out.println("Gib einen Text ein, der schiffriert werden soll!");
        StringBuilder text = new StringBuilder(ConsolReader.readString());
        System.out.println("Um wie viele Zeichen soll verschoben werden?");
        int rotation = ConsolReader.readInt();

        System.out.println(goCryptic(text, rotation));
        System.out.println(notSoCrypticPlease(text, rotation));
    }

    private static String notSoCrypticPlease(StringBuilder text, int rotation) {
        return goCryptic(text, -rotation);
    }

    private static String goCryptic(StringBuilder text, int rotation) {

        for (int index = 0; index < text.length(); index++){
            char currentChar = text.charAt(index);
            if(!Character.isAlphabetic(currentChar)){
                continue;
            }
            if(Character.isLowerCase(currentChar)){
                text.setCharAt(index, rotateLowerCase(currentChar, rotation));
            }else {
                text.setCharAt(index, rotateUpperCase(currentChar, rotation));
            }
        }
        return text.toString();
    }

    private static char rotateLowerCase(char currentChar, int rotation) {
        currentChar += rotation;
        if(currentChar > 'z'){
            currentChar = (char)('a' + currentChar - 'z' - 1);
        }
        if(currentChar < 'a'){
            currentChar = (char)('z' + currentChar - 'a' + 1);
        }
        return currentChar;
    }
    private static char rotateUpperCase(char currentChar, int rotation) {
        currentChar += rotation;
        if(currentChar > 'Z'){
            currentChar = (char)('A' + currentChar - 'Z' - 1);
        }
        if(currentChar < 'A'){
            currentChar = (char)('Z' + currentChar - 'A' + 1);
        }
        return currentChar;
    }
}
