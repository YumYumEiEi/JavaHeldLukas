import java.awt.*;

public class PolygonSpass {
    final static int DIMENSION = 50;
    final static String RAINBOW = "\uD83C\uDF08";
    final static String FOG = "\uD83C\uDF2B";
    final static String OCTOPUS = "\uD83D\uDC19";

    public static void go(){
        Polygon polygon = new Polygon();
        polygon.addPoint(5,8);
        polygon.addPoint(9,20);
        polygon.addPoint(33, 47);

        for(int x = 1; x <= DIMENSION; x++){
            for (int y = 1; y <= DIMENSION; y++){
                if(polygon.contains(x, y)){
                    System.out.print(OCTOPUS);
                } else if (x == DIMENSION || y == DIMENSION || x == 1 || y == 1) {
                    System.out.print(RAINBOW);
                }else{
                    System.out.print(FOG);
                }
            }
            System.out.println("");
        }
    }
}
