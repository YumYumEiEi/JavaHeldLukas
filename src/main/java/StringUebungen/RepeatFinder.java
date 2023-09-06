package StringUebungen;

import Util.ConsolReader;

public class RepeatFinder {
    public static void go(){
        System.out.println("Geben sie eine Zeichenfolge ein!");
        String string = ConsolReader.readString();

        System.out.println(findRepeatingString(string));
    }

    private static String findRepeatingString(String string) {
        int size = 1;
        String subString = "";
        while (size <= string.length()/2){
            if(string.length()%size != 0){
                size++;
            }else{
                subString = string.substring(0, size);
                String[] test = string.split(subString);
                if(test.length == 0){
                    return subString;
                }else{
                    size++;
                }
            }
        }
        return null;
    }
}
