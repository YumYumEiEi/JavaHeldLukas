public class MainClass {

    final static int LINE_PRINTER = 1;
    final static int RIGHT_TRIANGLE = 2;
    final static int ZAHLENSCHRIFT = 3;
    final static int COLLATZ = 4;
    final static int KOMPLIZIERTES_MULTIPLIZIEREN = 5;
    final static int POLYGON_SPASS = 6;
    final static int ARRAY_UMDREHEN = 7;
    final static int ARRAY_SPLIT = 8;
    final static int KNIFFELN = 9;
    final static int BERGSTEIGEN = 10;
    final static int QUATROPHOBIA = 11;
    final static int SODOKUFELD_CHECKER = 12;

    public static void main(String[] args) {

        System.out.println("1: Line Printer\n" +
                "2: Right Triangle\n" +
                "3: Zahlenschrift\n" +
                "4: Collatz\n" +
                "5: Kompliziertes Multiplizieren\n" +
                "6: Polygon Spaß\n" +
                "7: Arrays umdrehen\n" +
                "8: Array Split\n" +
                "9: Kniffeln\n" +
                "10: Bergsteigen\n" +
                "11: Quatrophobia\n" +
                "12: Sodokufeld Checker\n");
        int auszuführendenProgramm = new java.util.Scanner(System.in).nextInt();

        switch (auszuführendenProgramm) {
            case LINE_PRINTER:
                LinePrinter.line();
                break;
            case RIGHT_TRIANGLE:
                System.out.println(RightTriangle.isRightTriangle());
                break;
            case ZAHLENSCHRIFT:
                System.out.println(Zahlenschrift.go());
                break;
            case COLLATZ:
                System.out.println(Collatz.go());
                break;
            case KOMPLIZIERTES_MULTIPLIZIEREN:
                Multiplizierer.go();
                break;
            case POLYGON_SPASS:
                PolygonSpass.go();
                break;
            case ARRAY_UMDREHEN:
                ArrayDreher.go();
                break;
            case ARRAY_SPLIT:
                ArraySplitter.go();
                break;
            case KNIFFELN:
                Kniffler.go();
                break;
            case BERGSTEIGEN:
                Bergsteiger.go();
                break;
            case QUATROPHOBIA:
                Quatrophobia.go();
                break;
            case SODOKUFELD_CHECKER:
                SodokufeldChecker.go();
        }
    }
}
