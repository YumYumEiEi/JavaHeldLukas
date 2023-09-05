public class Rechtecksrotation {
    public static void main(String[] args) {
        int winkel = 10;
        String svg = "<svg height=\"200\" width=\"200\">\n";
        for (int counter = 0; counter < 36; counter ++){
            int rotation = winkel * counter;
            svg +=  " <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"\n" +
                    "       transform=\"rotate(" + rotation + " 100 100)\" />\n";
        }
        svg += "</svg>";
        System.out.println(svg);

    }
}
