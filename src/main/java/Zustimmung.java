public class Zustimmung {
    public static void main(String[] args) {
        String aussage = new java.util.Scanner(System.in).nextLine();

        switch (aussage){
            case "ay":
            case "aye":
            case "ay, ay":
            case "ja":
            case "joo":
                System.out.println("Keep it up!");
                break;
            default:
                System.out.println("Don't you dare!");

        }

        String output = switch (aussage){
            case "ay", "aye", "ay, ay", "ja", "joo" -> "Keep it up!";
            case "Kommt drauf an" -> {
                System.out.println("Ich überlegs mir.");
                yield "Find ich nicht gut";
            }
            default -> "Don't you dare!";
        };
        System.out.println(output);
    }
}
