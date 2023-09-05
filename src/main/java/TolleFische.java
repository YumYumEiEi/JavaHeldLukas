public class TolleFische {
    public static void main(String[] args) {
        int repetitions = new java.util.Scanner(System.in).nextInt();
        String output = "";
        output += addToString("><> ", repetitions);
        output += addToString("<>< ", repetitions);

        for (int repetition = 0; repetition < repetitions; repetition++){
            System.out.println(output);
        }
    }

    private static String addToString (String add, int repetitions){
        String returnValue = "";
        for (int repetition = 0; repetition < repetitions; repetition++){
            returnValue += add;
        }
        return returnValue;
    }
}
