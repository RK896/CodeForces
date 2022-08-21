import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int k = s.nextInt()-1;

        int[] scores = new int[n];

        for (int i = 0; i < n; i++)
            scores[i] = s.nextInt();

        int count = 0;
        for (int x : scores) {
            if (x >= scores[k] && x > 0)
                count++;
        }
        System.out.println(count);

    }
}
