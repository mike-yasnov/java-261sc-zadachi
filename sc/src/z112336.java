import java.util.Scanner;

public class z112336 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                c++;
            }
        }
        s = s.replace('a', 'b');
        System.out.println(s);
        System.out.println(c);
    }
}
