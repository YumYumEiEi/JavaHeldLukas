package Util;

public class ConsolReader {

    public static Long readLong(){
        return new java.util.Scanner(System.in).nextLong();
    }

    public static int readInt() {
        return new java.util.Scanner(System.in).nextInt();
    }

    public static String readString() {
        return new java.util.Scanner(System.in).nextLine();
    }
}
