import java.util.Scanner;

public class Stepa_z1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t;
        int lines[] = new int[n];
        String lines_s[] = new String[n];
        String t_s;
        for (int i=0; i<n; i++)
        {
            lines_s[i] = sc.nextLine();
            lines[i] = lines_s[i].length();
        }

        for (int i=0; i<n; i++)
        {
            for (int j=0; j<n-1; j++) {
                if (lines[j] < lines[j + 1]) {
                    t = lines[j];
                    lines[j] = lines[j + 1];
                    lines[j + 1] = t;

                    t_s = lines_s[i];
                    lines_s[j] = lines_s[j + 1];
                    lines_s[j + 1] = t_s;                }
            }
        }

        for (int i=0; i<n; i++)
        {
            System.out.println(lines_s[i]);
        }

    }
}

