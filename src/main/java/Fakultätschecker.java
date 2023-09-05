public class Fakultätschecker {
    public static void main(String[] args) {
        int nummer = new java.util.Scanner(System.in).nextInt();
        int counter = 1;
        do{
            nummer /= counter;
            if(nummer > 1){
                counter++;
            }
        }while (nummer > 1 && nummer%counter == 0);

        if (nummer == 1){
            System.out.println("Zahl war eine Fakultät von " + counter);
        }else{
            System.out.println("Zahl war keine Fakultät");
        }
    }
}
