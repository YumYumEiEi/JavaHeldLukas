import Util.ConsolReader;

public class Collatz {
    private static long collatz (long number, long max){
        if(number > 1){
            if(number%2 == 0){
                number /= 2;
            }else{
                number = number*3 +1;
            }
            System.out.println(number);
            if(number > max){
                max = number;
            }
            max = collatz(number, max);
            return max;
        }else{
            return max;
        }
    }

    public static long go(){
        System.out.println("Give a Number!");
        return collatz(ConsolReader.readLong(), 0);
    }


}
