import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lecture6Exercises {


    public long calculateEvenSum(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }

        return sum;
    }


    public int[] reverseArray(int[] arr) {
        int[] lastArr = new int[arr.length];

        for (int i = arr.length-1 ; i >= 0 ; i--)
        {
            lastArr[arr.length-i-1] = arr[i];
        }

        return lastArr;
    }


    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {

        double[][] sub = new double[m1.length][m2[0].length];

        if(m1[0].length != m2.length)
        {
            throw new RuntimeException("this multiplication will not be done because it is against the law of matrix multiplication");
        }

        else
        {

            for (int i = 0 ; i < m1.length ; i++)
            {

                for (int j = 0 ; j < m2[0].length ; j++)
                {
                    for (int k = 0 ; k < m1[0].length ; k++)
                    {
                        sub[i][j] += m1[i][k] * m2[k][j];
                    }

                }


            }

            return sub;
        }

    }

    public List<List<String>> arrayToList(String[][] names) {

        List<List<String>> arr = new ArrayList<>();

        for(int i = 0 ; i < names.length ; i++ )
        {
            arr.add(List.of(names[i]));
        }

        return arr;
    }


    public List<Integer> primeFactors(int n){

    List<Integer> intArr = new ArrayList<>();

    for(int i = 2 ; i < n/2 ; i++)
    {
        if(n % i == 0)
        {
            intArr.add(i);

            while (n % i == 0)
            {
                n /= i;
            }


        }

    }

        return intArr;
    }


    public List<String> extractWord(String line) {

        List<String> w = new ArrayList<>();
            Pattern pattern = Pattern.compile("[a-zA-Z]+");
            Matcher matcher = pattern.matcher(line);
            while (matcher.find())
            {
                w.add(matcher.group());
            }
        return w;
    }
}
