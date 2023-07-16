import java.util.Scanner;

public class ChallengeEleven {
    public static void main(String[] args) {
        timeCalculatorGame();
    }

    private static void timeCalculatorGame() {
        Scanner string = new Scanner(System.in);

        int timeStart, timeFinal;
        int timeFinish;

        System.out.print("Start time: ");
        timeStart = string.nextInt();

        System.out.print("Final time: ");
        timeFinal = string.nextInt();

        if (timeStart < timeFinal) {
            timeFinish = timeFinal - timeStart;
        } else {
            timeFinish = 24 - timeStart + timeFinal;
        }

        System.out.println("Game lasted: " + timeFinish + " hours");

        string.close();
    }
}
