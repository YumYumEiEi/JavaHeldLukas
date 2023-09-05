public class Weihnachtsbaum {
    public static void main(String[] args) {
        int width = new java.util.Scanner(System.in).nextInt();

        for( int leafes = 1; leafes < width; leafes += 2){
            String leafeRow = "";
            for(int emptyness = 0; emptyness < width/2 - leafes/2; emptyness++){
                leafeRow += " ";
            }
            for(int leaf = 0; leaf < leafes; leaf++){
                int random = (int) (Math.random() * 10);
                leafeRow += random < 3 ? "°" : "*";
            }
            System.out.println(leafeRow);
        }
    }

}
