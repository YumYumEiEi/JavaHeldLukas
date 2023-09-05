import java.text.DecimalFormat;

public class CoinMashine {
    public static void main(String[] args) {

        double geldbetragInCents = new java.util.Scanner(System.in).nextDouble() * 100;

        geldbetragInCents = Math.round(geldbetragInCents);
        System.out.println(geldbetragInCents);

        double tmp = geldbetragInCents%200;
        System.out.println((int)geldbetragInCents/200);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%100;
        System.out.println((int)geldbetragInCents/100);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%50;
        System.out.println((int)geldbetragInCents/50);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%20;
        System.out.println((int)geldbetragInCents/20);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%10;
        System.out.println((int)geldbetragInCents/10);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%5;
        System.out.println((int)geldbetragInCents/5);
        geldbetragInCents = tmp;

        tmp = geldbetragInCents%2;
        System.out.println((int)geldbetragInCents/2);
        geldbetragInCents = tmp;

        System.out.println((int)geldbetragInCents);


    }
}
