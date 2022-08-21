import java.util.*;

public class Herdle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] guess = new char[3][3];
        char[][] solution = new char[3][3];
        for (int i = 0; i < guess.length; i++) {
            String nextLine = s.nextLine();
            guess[i][0] = nextLine.charAt(0);
            guess[i][1] = nextLine.charAt(1);
            guess[i][2] = nextLine.charAt(2);
        }
        for (int i = 0; i < guess.length; i++) {
            String nextLine = s.nextLine();
            solution[i][0] = nextLine.charAt(0);
            solution[i][1] = nextLine.charAt(1);
            solution[i][2] = nextLine.charAt(2);
        }

        int yellow = 0;
        int green = 0;
        for (int i = 0; i < guess.length; i++) {
            for (int j = 0; j < guess.length; j++) {
                if (guess[i][i] == solution[i][i])
                    green++;
            }
        }


    }
}
