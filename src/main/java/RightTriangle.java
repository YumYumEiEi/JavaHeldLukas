public class RightTriangle {
    public static boolean isRightTriangle(){
        System.out.println("Gib die Längen der Seiten a, b und c an!");
        double a = new java.util.Scanner(System.in).nextDouble();
        double b = new java.util.Scanner(System.in).nextDouble();
        double c = new java.util.Scanner(System.in).nextDouble();

        return isRightTriangle(a, b, c);
    }

    public static boolean isRightTriangle(double a, double b, double c){
        double tmp;
        if(a>c){
            tmp = c;
            c = a;
            a = tmp;
        }
        if(b>c){
            tmp = c;
            c = b;
            b = tmp;
        }
        return (square(a) + square(b) == square(c));
    }

    private static double square( double number){
        return number * number;
    }
}
