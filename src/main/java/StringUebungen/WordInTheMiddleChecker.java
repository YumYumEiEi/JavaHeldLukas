package StringUebungen;

import Util.ConsolReader;

public class WordInTheMiddleChecker {

    public static void go(){
        System.out.println("Type something");
        String string = ConsolReader.readString();
        System.out.println("What should be in the middle?");
        String middle = ConsolReader.readString();

        System.out.println(checkIfWordIsInTheMiddle(string, middle));

    }

    private static boolean checkIfWordIsInTheMiddle(String string, String middle) {
        String[] theHalves = string.split(middle);
        if(theHalves.length != 2){
            return false;
        }
        return theHalves[0].length() == theHalves[1].length();
    }
}
