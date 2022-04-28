import java.util.Scanner;

public class Stepa_z3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(), k=0;
        boolean flag = false;
        String words[] = new String[n];
        String words_norm[] = new String[n];
        for (int i=0; i<n; i++)
        {
            words[i] = sc.next();
        }

        for (int i=0; i<n; i++)
        {
            char char_arr[] = words[i].toCharArray();
            flag = false;
            for (int j=0; j<char_arr.length-1; j++)
            {
                if ((int) char_arr[j]+1 == (int) char_arr[j+1])
                {
                    flag = true;
                }
                else
                {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                words_norm[k] = words[i];
                k++;
            }

        }
        System.out.print(words_norm[0]);

    }
}

