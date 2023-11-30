import java.util.Scanner;
public class FenceProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int h = s.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (s.nextInt() > h)
                sum+=2;
            else
                sum++;
        }
        System.out.println(sum);

    }
}
