import java.util.Scanner;
public class sol {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long x = in.nextInt();
        int distressed = 0;
        for (int i = 0; i < n; i++) {
            String q = in.next();
            long d = in.nextInt();
            if (q.charAt(0) == '+')
                x += d;
            else {
                if (d > x) { distressed++; }
                else { x -= d; }
            }
        }
        System.out.println(x + " " + distressed);
    }
}
