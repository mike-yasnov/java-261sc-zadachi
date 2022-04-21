import java.util.Scanner;

public class z112341 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(), max_s = "";
        String[] words = s.split(" ");
        int max_l=0, l;
        for (int i=0; i < words.length; i++)
        {
            l = words[i].length();
            if (l > max_l)
            {
                max_l = l;
                max_s = words[i];
            }
        }
        System.out.println(max_s);
        System.out.println(max_l);
    }
}

