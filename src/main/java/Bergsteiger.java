public class Bergsteiger {

    public static void go() {
        int length = (int) (Math.random() * 20 + 10);
        int[] mountain = new int[length];
        char[] mountainChars = new char[length];
        int max = buildMountain(mountain);
        buildMountainChars(mountainChars, mountain, max);
        int[][] mountainParts = new int[max + 1][length];
        fillMountainParts(mountainParts, mountain);
        printMountain(mountainParts);
        printMountainTwo(mountainParts, mountainChars);
    }

    private static void buildMountainChars(char[] mountainChars, int[] mountain, int max) {
        mountainChars[0] = '/';
        for(int index = 1; index < mountain.length; index++){
            int test = mountain[index-1] - mountain[index];
            switch (test){
                case 0:
                    mountainChars[index] = '-';
                    break;
                case 1:
                    mountainChars[index] = '\\';
                    break;
                case -1:
                    mountainChars[index] = '/';
            }
            if(mountain[index] == max){
                mountainChars[index] = '^';
            }
        }
    }

    private static void printMountainTwo(int[][] mountainParts, char[] parts) {
        for (int height = mountainParts.length - 1; height >= 0; height--) {
            for (int index = 1; index < mountainParts[height].length; index++) {
                if (mountainParts[height][index] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(parts[index]);
                }
            }
            System.out.println();
        }
    }

    private static void printMountain(int[][] mountainParts) {
        for (int height = mountainParts.length - 1; height >= 0; height--) {
            for (int index = 0; index < mountainParts[height].length; index++) {
                if (mountainParts[height][index] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void fillMountainParts(int[][] mountainParts, int[] mountain) {
        for (int index = 0; index < mountain.length; index++) {
            mountainParts[mountain[index]][index] = 1;
        }
    }

    private static int buildMountain(int[] mountain) {
        mountain[0] = 0;
        int max = 0;
        for (int index = 1; index < mountain.length; index++) {
            if (mountain[index - 1] == 0) {
                mountain[index] = mountain[index - 1] + 1;
            } else {
                int random = (int) (Math.random() * 3 + 1);

                switch (random) {
                    case 1:
                        mountain[index] = mountain[index - 1] + 1;
                        break;
                    case 2:
                        mountain[index] = mountain[index - 1] - 1;
                        break;
                    case 3:
                        mountain[index] = mountain[index - 1];
                        break;
                    default:
                        mountain[index] = mountain[index - 1];
                }
                max = Math.max(mountain[index], max);
            }
        }
        return max;
    }
}
