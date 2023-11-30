import java.util.Scanner;
public class ChessProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = 0;
        int D = 0;
        int n = Integer.parseInt(s.nextLine());
        String[] games = s.nextLine().split("");
        for (int i = 0; i < n; i++) {
            if (games[i].equals("A"))
                A++;
            else
                D++;
        }
        if (A > D) {
            System.out.println("Anton");
        } else if (D > A) {
            System.out.println("Danik");
        } else
            System.out.println("Friendship");
    }
}
