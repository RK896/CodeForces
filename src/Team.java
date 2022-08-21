import java.util.*;
public class Team {

    public static void main(String[] args) {
        int toSolve = 0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < 3; j++) {
                if (s.nextInt() == 1)
                    count++;
            }
            if (count >= 2)
                toSolve++;
        }
        System.out.println(toSolve);
    }
}
