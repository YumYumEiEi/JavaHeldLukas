public class HisstDieFlagge {
    public static void main(String[] args) {
        for (int counter = 1; counter <=5; counter++){
            String ausgabe = "";
            for ( int anzahl = 1; anzahl <= counter; anzahl++){
                ausgabe += counter + " ";
            }
            System.out.println(ausgabe);
        }
    }
}
