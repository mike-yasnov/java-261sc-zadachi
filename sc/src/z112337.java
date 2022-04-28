import java.util.Scanner;

public class z112337 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                System.out.print('b');
                c++;
            }
            else if (s.charAt(i) == 'b') {
                System.out.print('a');
                c++;
            }
            else if (s.charAt(i) == 'A') {
                System.out.print('B');
                c++;
            }
            else if (s.charAt(i) == 'B') {
                System.out.print('A');
                c++;
            }
            else
            {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();
        System.out.println(c);
    }
}
