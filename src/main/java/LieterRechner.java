public class LieterRechner {
    public static void main(String[] args) {
        double lieter = new java.util.Scanner(System.in).nextDouble();

        if(lieter >= 1){
            System.out.println(Math.round(lieter));
        }else if(lieter >= 0.1){
            System.out.println(Math.round(lieter*100));
        }else if (lieter >= 0.001){
            System.out.println(Math.round(lieter*1000));
        }else{
            System.out.println("Value too small to display.");
        }
    }
}
