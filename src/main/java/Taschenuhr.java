public class Taschenuhr {
    public static void main(String[] args) {
        double betrag = 1000;
        double min = betrag * 0.9;
        double max = betrag * 1.2;
        double rueckzahlung = new java.util.Scanner(System.in).nextDouble();


        if(rueckzahlung < min || rueckzahlung > max ){
            System.out.println("You son of a B***");
        }else{
            System.out.println("Good Boy");
        }
    }
}
