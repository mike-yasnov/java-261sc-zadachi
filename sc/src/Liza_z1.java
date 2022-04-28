import java.util.Scanner;

public class Liza_z1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), max_l=0, min_l=100000000;
        String max_s = "", min_s="";

        String lines[] = new String[n];

        for (int i=0; i<n; i++)
        {
            lines[i] = sc.nextLine();
        }


        for (int i=0; i<n; i++)
        {
            if (lines[i].length() > max_l)
            {
                max_l = lines[i].length();
                max_s = lines[i];
            }

            if (lines[i].length() < min_l)
            {
                min_l = lines[i].length();
                min_s = lines[i];
            }



            System.out.println(max_l);
            System.out.println(max_s);
            System.out.println(min_l);
            System.out.println(min_s);

        }
    }
}

