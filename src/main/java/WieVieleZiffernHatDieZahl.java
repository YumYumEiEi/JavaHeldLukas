public class WieVieleZiffernHatDieZahl {
    public static void main(String[] args) {
        int number = new java.util.Scanner(System.in).nextInt();
        int counter = 0;
        do{
            number /= 10;
            counter++;
        }while (number > 0);
        System.out.println(counter);

    }
}
