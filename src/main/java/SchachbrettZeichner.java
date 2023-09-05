public class SchachbrettZeichner {
    public static void main(String[] args) {
        int width = new java.util.Scanner(System.in).nextInt();
        int height = new java.util.Scanner(System.in).nextInt();

        for (int line = 0; line < height; line++){
            for(int row = 0; row < width; row++){
                String field = (row+line)%2 == 0 ? "_ " : "# ";
                System.out.print(field);
            }
            System.out.println();
        }
    }
}
