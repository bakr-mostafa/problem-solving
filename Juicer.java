    import java.util.Scanner;
    public class sol {
        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int b = in.nextInt();
            int d = in.nextInt();
            int a, size = 0, count = 0;
            for (int i = 0; i < n; i++){
                a = in.nextInt();
                if (a > b)
                    continue;
                size += a;
                if (size > d){
                    count++;
                    size = 0;
                }
            }
            System.out.println(count);
        }
    }
