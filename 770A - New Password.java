import java.util.Scanner;
public class sol {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int t = 0;
        for (int i = 0; i < n; i++) {
            password += letters.charAt(t);
            t++;
            if (t >= k) { t = 0; }
        }
        System.out.println(password);
    }
}
