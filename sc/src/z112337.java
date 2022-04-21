import java.util.Scanner;

public class z112337 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                c++;
            }
        }
        s = s.replace('a', 'b');
        s = s.replace('A', 'B');
        System.out.println(s);
        System.out.println(c);
    }
}
