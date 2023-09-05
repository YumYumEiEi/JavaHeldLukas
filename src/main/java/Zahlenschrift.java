public class Zahlenschrift {

    public static String go(){
        System.out.println("Geben sie eine Zahl mit maximal 4 Ziffern ein!");
        int number = new java.util.Scanner(System.in).nextInt();
        return convertNumberToSVG(number);
    }

    private static String convertNumberToSVG(int number){
        int[] allDigets = splitNumberInDigets(number);
        String svg = "<svg height=\"1400\" width=\"1400\">\n" +
                "<g style=\"stroke:grey;stroke-linecap:round;stroke-width:2\">\n" +
                addLine(50, 50, 125, 0);

        for (int counter = 0; counter < allDigets.length; counter++){
            svg += addDigetToSVG(counter, allDigets[counter]);
        }

        return svg + "</g>\n</svg>";
    }

    private static String addDigetToSVG(int counter, int diget) {
        switch (counter){
            case 0:
                return addFirstDiget(diget);
            case 1:
                return addSecondDiget(diget);
            case 2:
                return addThirdDiget(diget);
            case 3:
                return addForthDiget(diget);
            default:
                return "";
        }
    }

    private static String addFirstDiget(int diget) {
        String svg = "";
        switch (diget){
            case 1:
                svg += addLine(50, 100, 0, 0);
                break;
            case 2:
                svg += addLine(50, 100, 50, 50);
                break;
            case 3:
                svg += addLine(50, 100, 0, 50);
                break;
            case 4:
                svg += addLine(50, 100, 50, 0);
                break;
            case 5:
                svg += addLine(50, 100, 0, 0);
                svg += addLine(50, 100, 50, 0);
                break;
            case 6:
                svg += addLine(100, 100, 0, 50);
                break;
            case 7:
                svg += addLine(50, 100, 0, 0);
                svg += addLine(100, 100, 0, 50);
                break;
            case 8:
                svg += addLine(50, 100, 50, 50);
                svg += addLine(100, 100, 50, 0);
                break;
            case 9:
                svg += addLine(50, 100, 50, 50);
                svg += addLine(50, 100, 0, 0);
                svg += addLine(100, 100, 50, 0);

        }
        return svg;
    }

    private static String addSecondDiget(int diget) {
        String svg = "";
        switch (diget){
            case 1:
                svg += addLine(50, 0, 0, 0);
                break;
            case 2:
                svg += addLine(50, 0, 50, 50);
                break;
            case 3:
                svg += addLine(50, 0, 0, 50);
                break;
            case 4:
                svg += addLine(50, 0, 50, 0);
                break;
            case 5:
                svg += addLine(50, 0, 0, 0);
                svg += addLine(50, 0, 50, 0);
                break;
            case 6:
                svg += addLine(0, 0, 0, 50);
                break;
            case 7:
                svg += addLine(50, 0, 0, 0);
                svg += addLine(0, 0, 0, 50);
                break;
            case 8:
                svg += addLine(50, 0, 50, 50);
                svg += addLine(0, 0, 0, 50);
                break;
            case 9:
                svg += addLine(50, 0, 50, 50);
                svg += addLine(50, 0, 0, 0);
                svg += addLine(0, 0, 50, 0);

        }
        return svg;
    }

    private static String addThirdDiget(int diget) {
        String svg = "";
        switch (diget){
            case 1:
                svg += addLine(50, 100, 125, 125);
                break;
            case 2:
                svg += addLine(50, 100, 75, 75);
                break;
            case 3:
                svg += addLine(50, 100, 125, 75);
                break;
            case 4:
                svg += addLine(50, 100, 75, 125);
                break;
            case 5:
                svg += addLine(50, 100, 125, 125);
                svg += addLine(50, 100, 75, 125);
                break;
            case 6:
                svg += addLine(100, 100, 125, 75);
                break;
            case 7:
                svg += addLine(50, 100, 125, 125);
                svg += addLine(100, 100, 125, 75);
                break;
            case 8:
                svg += addLine(50, 100, 75, 75);
                svg += addLine(100, 100, 75, 125);
                break;
            case 9:
                svg += addLine(50, 100, 75, 75);
                svg += addLine(50, 100, 125, 125);
                svg += addLine(100, 100, 75, 125);

        }
        return svg;
    }

    private static String addForthDiget(int diget) {
        String svg = "";
        switch (diget){
            case 1:
                svg += addLine(50, 0, 125, 125);
                break;
            case 2:
                svg += addLine(50, 0, 75, 75);
                break;
            case 3:
                svg += addLine(50, 0, 125, 75);
                break;
            case 4:
                svg += addLine(50, 0, 75, 125);
                break;
            case 5:
                svg += addLine(50, 0, 125, 125);
                svg += addLine(50, 0, 75, 125);
                break;
            case 6:
                svg += addLine(0, 0, 125, 75);
                break;
            case 7:
                svg += addLine(50, 0, 125, 125);
                svg += addLine(0, 0, 125, 75);
                break;
            case 8:
                svg += addLine(50, 0, 75, 75);
                svg += addLine(0, 0, 75, 125);
                break;
            case 9:
                svg += addLine(50, 0, 75, 75);
                svg += addLine(50, 0, 125, 125);
                svg += addLine(0, 0, 75, 125);

        }
        return svg;
    }

    private static int[] splitNumberInDigets(int number) {
        int numberOfDigets = countDigets(number);
        int[] allDigets = new int[numberOfDigets];
        for(int counter = 0; counter < numberOfDigets; counter++){
            allDigets[counter] = (number/((int)Math.pow(10, counter)))%10;
        }
        return allDigets;
    }

    private static int countDigets(int number) {
        if(number < 10){
            return 1;
        } else if (number < 100) {
            return 2;
        } else if (number < 1000) {
            return 3;
        }else {
            return 4;
        }
    }

    private static String addLine (int x1, int x2, int y1, int y2){
        return "<line x1=\"" + x1 + "\" y1=\"" + y1 + "\" x2=\"" + x2 + "\" y2=\"" + y2 + "\" />\n";
    }
}
