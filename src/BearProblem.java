import java.util.Scanner;

public class BearProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int b = s.nextInt();

        int years = 0;
        while (l <= b) {
            l=3*l;
            b=2*b;
            years++;
        }
        System.out.println(years);
    }
}
