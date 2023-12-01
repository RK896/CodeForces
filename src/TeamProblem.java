import java.util.Scanner;

public class TeamProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int toSolve = 0;
        for (int i = 0; i < n; i++) {
            if (s.nextInt()+s.nextInt()+s.nextInt() >=  2) {
                toSolve++;
            }
        }
        System.out.println(toSolve);
    }
}
