public class SummingCalculator {
    public static void main(String[] args) {
        int summe = 0;
        boolean beendet = false;

        do{
            int eingabe = new java.util.Scanner(System.in).nextInt();
            beendet = eingabe == 0;
            summe += eingabe;
        }while (!beendet);

        System.out.println(summe);
    }
}
