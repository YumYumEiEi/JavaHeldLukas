public class Flaschenzähler {
    public static void main(String[] args) {
        int noOfBottles = 20;
        String output = noOfBottles == 0 ? "0 bottles of rum" : noOfBottles == 1 ? "1 bottle of rum" : noOfBottles + " bottles of rum";
        System.out.println(output);
    }
}
