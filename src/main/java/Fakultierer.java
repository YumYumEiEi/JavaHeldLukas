public class Fakultierer {
    public static void main(String[] args) {
        int number = new java.util.Scanner(System.in).nextInt();
        int result = 1;
        if (number < 0){
            System.out.println("Number must not be negative");
        }else{
            for (; number > 0; number--){
                result *= number;
            }
        }
        System.out.println(result);
    }
}
