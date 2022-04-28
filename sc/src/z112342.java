import java.util.Scanner;

public class z112342 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace(" ", ":");
        String[] words = s.split(" ");
        System.out.println(s);
        System.out.print(words.length);
    }
}

