import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] out = new String[n];

        for (int i = 0; i < out.length; i++) {
            out[i] = s.next();
        }

        for (String x : out) {
            if (x.length() > 10)
                System.out.println(x.charAt(0) + "" + (x.length()-2) + "" + x.charAt(x.length()-1));
            else
                System.out.println(x);
        }


    }


}
