import jdk.jshell.execution.JdiInitiator;

public class Kniffler {
    public static void go() {
        int[] dice = throwTheDice(5);
        isHomogen(dice);
        isFullHouse(dice);
        printDice(dice);
    }

    private static void printDice(int[] dice) {
        int[] values = new int[6];
        for (int value : dice) {
            values[value - 1]++;
        }
        for (int index = 0; index < values.length; index++) {
            if (values[index] != 0) {
                System.out.print(gedDice(index + 1) + ": " + values[index]);
            }
        }
    }

    private static String gedDice(int i) {
        switch (i) {
            case 1:
                return "⚀";
            case 2:
                return "⚁";
            case 3:
                return "⚂";
            case 4:
                return "⚃";
            case 5:
                return "⚄";
            case 6:
                return "⚅";
        }
        return "";
    }

    private static void isFullHouse(int[] dice) {
        int numberOne = dice[0];
        int numberTwo = 0;
        int counterOne = 1;
        int counterTwo = 0;

        for (int index = 1; index < dice.length; index++) {
            if (numberTwo == 0) {
                if (dice[index] != numberOne) {
                    numberTwo = dice[index];
                    counterTwo++;
                }
            } else {
                if (dice[index] != numberOne && dice[index] != numberTwo) {
                    break;
                } else {
                    if (dice[index] == numberOne) {
                        counterOne++;
                    } else {
                        counterTwo++;
                    }
                }
            }

        }
        if(counterOne + counterTwo == 5){
            System.out.println(Math.abs(counterOne - counterTwo) == 1 ? "Fullhouse" : "No Fullhouse");
        }else{
            System.out.println("No Fullhouse");
        }
    }

    private static void isHomogen(int[] dice) {
        boolean isHomogen = false;
        int number = dice[0];
        for (int index = 1; index < dice.length; index++) {
            isHomogen = number == dice[index];
            if (!isHomogen) {
                break;
            }
        }
        System.out.println(isHomogen ? "Homogen" : "Nonhomogen");

    }

    private static int[] throwTheDice(int numberOfDice) {
        int[] dice = new int[numberOfDice];
        for (int index = 0; index < dice.length; index++) {
            dice[index] = (int) (Math.random() * 6 + 1);
        }
        return dice;
    }
}
