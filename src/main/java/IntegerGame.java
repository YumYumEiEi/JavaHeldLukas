public class IntegerGame {
    public static void main(String[] args) {
        long number = new java.util.Scanner(System.in).nextLong();
        int highNmber = 0;
        int lowNumber = 9;

        while (number > 0){
            int lastDiget = (int) number%10;
            if(highNmber < lastDiget){
                highNmber = lastDiget;
            }
            if(lowNumber > lastDiget){
                lowNumber = lastDiget;
            }
            number /= 10;
        }

        System.out.println(lowNumber + ", " + highNmber);
    }

}
