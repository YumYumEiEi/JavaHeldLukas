public class Application {
    public static void main(String[] args) {
        int zahlEins = new java.util.Scanner(System.in).nextInt();
        int zahlZwei = new java.util.Scanner(System.in).nextInt();

        String stringEins = "0" + zahlEins;
        String stringZwei = "0" + zahlZwei;

        stringEins = stringEins.substring(stringEins.length()-2, stringEins.length());
        String stelleEins = stringEins.substring(0,1);
        String stelleZwei = stringEins.substring(1,2);
        stringZwei = stringZwei.substring(stringZwei.length()-2, stringZwei.length());

        System.out.println(stelleEins);
        System.out.println(stelleZwei);
        System.out.println(stringZwei);
        System.out.println(stringZwei.contains(stelleEins)||stringZwei.contains(stelleZwei));
    }
}