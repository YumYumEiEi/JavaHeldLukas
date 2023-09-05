public class KreisZeichner {
    public static void main(String[] args) {
        int x = 20;
        int y = 20;

        double r = 5;

        String color = "white";

        String perlenkette = "<svg height=\"100\" width=\"1000\">\n";

        for ( int perlen = 0; perlen < 50; perlen++){
            double random = Math.random();
            if(random < 1.0 / 3){
                color = "blue";
            }else if(random < 2.0 / 3){
                color = "orange";
            }else{
                color = "green";
            }
            perlenkette += " <circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + r + "\" fill=\"" + color + "\" />\n";
            x += 10;
        }
        perlenkette += "</svg>";

        System.out.println(perlenkette);
    }
}
