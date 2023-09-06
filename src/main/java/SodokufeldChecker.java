public class SodokufeldChecker {

    public static void go(){
        int[][] sodokuFiled = new int[3][3];
        ArrayDreher.fillNumbersArray(sodokuFiled[0]);
        ArrayDreher.fillNumbersArray(sodokuFiled[1]);
        ArrayDreher.fillNumbersArray(sodokuFiled[2]);

        System.out.println(checkIfLegal(sodokuFiled));
    }

    private static boolean checkIfLegal(int[][] sodokuFiled) {
        int[] foundNumbers = new int[sodokuFiled.length * sodokuFiled[0].length];
        boolean legal = true;
        for (int row = 0; row < sodokuFiled.length; row++){
            for (int collum = 0; collum < sodokuFiled[row].length; collum++){
                if(sodokuFiled[row][collum]-1 >= foundNumbers.length){
                    return false;
                }
                if(foundNumbers[sodokuFiled[row][collum]-1] == 1){
                    legal = false;
                }else {
                    foundNumbers[sodokuFiled[row][collum]-1] = 1;
                }
            }
        }
        return legal;
    }
}
