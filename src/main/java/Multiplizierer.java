import Util.ConsolReader;

public class Multiplizierer {
    public static void go() {
        System.out.println("Gib eine nummer ein!");
        int number = ConsolReader.readInt();
        System.out.println("Mit welcher Nummer soll Multipliziert werden?");
        int multiplikant = ConsolReader.readInt();
        System.out.println(multiplyRecursive(number, multiplikant, 0));

    }

    private static long multiply(int number, int multiplikant) {
        int ergebnis = 0;
        while (number > 0) {
            if (isRound(number)) {
                number /= 2;
                multiplikant *= 2;
            } else {
                number--;
                ergebnis += multiplikant;
            }
        }
        return ergebnis;
    }

    private static boolean isRound(int number) {
        return (number % 2 == 0);
    }

    private static long multiplyRecursive(int number, int multiplikant, long ergebnis) {

        if (isRound(number)) {
            number /= 2;
            multiplikant *= 2;
        } else {
            number--;
            ergebnis += multiplikant;
        }
        if (number > 0) {
            return multiplyRecursive(number, multiplikant, ergebnis);
        } else {
            return ergebnis;
        }
    }
}
