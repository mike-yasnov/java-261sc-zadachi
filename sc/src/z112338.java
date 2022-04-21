import java.util.Scanner;

public class z112338 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder new_s= new StringBuilder();


        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                new_s.append("b");
                c++;
            }
            else if (s.charAt(i) == 'b') {
                new_s.append("a");
                c++;
            }
            else if (s.charAt(i) == 'A') {
                new_s.append("B");
                c++;
            }
            else if (s.charAt(i) == 'B') {
                new_s.append("A");
                c++;
            }
            else
            {
                new_s.append(s.charAt(i));
            }
        }
        System.out.println(new_s);
        System.out.println(c);
    }
}
