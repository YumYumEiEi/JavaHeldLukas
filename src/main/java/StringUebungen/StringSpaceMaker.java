package StringUebungen;

import Util.ConsolReader;

public class StringSpaceMaker {
    public static void go(){
        System.out.println("Bitte gib einen String ein!");
        String string = ConsolReader.readString();
        System.out.println("Bitte gib den String ein, welcher dazwischen gesetzt werden soll");
        String place = ConsolReader.readString();

        System.out.println(mix(string, place));
    }

    private static String mix(String string, String place) {
        if(string == null){
            return "";
        } else if (place == null) {
            return string;
        }
        StringBuilder mixedString = new StringBuilder(string);
        for(int index = 1; index < mixedString.length(); index += place.length()+1){
            mixedString.insert(index, place);
        }

        return mixedString.toString();
    }


}
