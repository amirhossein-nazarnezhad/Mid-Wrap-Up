import java.util.ArrayList;

public class Lecture4Exercises {

    public long factorial(int n) {
        if(n == 0 || n == 1)
        {
            return 1;
        }

        else
        {
            return factorial(n-1) * n ;
        }

    }

    public long fibonacci(int n) {

        if(n == 1 || n == 0)
        {
            return n;
        }

        else
        {
            return fibonacci(n-2) + fibonacci(n-1);
        }

    }


    public String reverse(String word) {

        char[] w = word.toCharArray();
        String word2 = "";

        for(int i = w.length - 1 ; i >= 0  ; i--)
        {
            String ch = String.valueOf(w[i]);
            word2 += ch ;
        }

        return word2;
    }


    public boolean isPalindrome(String line) {

        char[] w = line.toCharArray();

        String word3 = "";

        for(int i = 0 ; i <= w.length - 1  ; i++)
        {
            if(w[i] == ' ')
            {
                continue;
            }
            else
            {
                String ch = String.valueOf(w[i]);
                word3 += ch ;
            }
        }

        String word2 = "";

        for(int i = w.length - 1 ; i >= 0  ; i--)
        {
            if(w[i] == ' ')
            {
                continue;
            }
            else
            {
                String ch = String.valueOf(w[i]);
                word2 += ch ;
            }
        }

        if(word2.equalsIgnoreCase(word3))
        {
            return true;
        }

        else
        {
            return false;
        }

    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        char[][] last = new char[str1.length()][str2.length()];

        for (int i = 0 ; i < str1.length() ; i++ )
        {
            for(int j = 0 ; j < str2.length() ; j++)
            {
                if(ch1[i] == ch2[j])
                {
//                    System.out.print("*");
                    last[i][j] = '*';
                }

                else
                {
//                    System.out.print(" ");
                    last[i][j] = ' ';
                }
            }

//            System.out.println();
        }

        return last;
    }
}
