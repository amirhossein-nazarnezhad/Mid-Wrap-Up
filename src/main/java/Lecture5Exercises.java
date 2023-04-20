import java.util.Random;

public class Lecture5Exercises {


    public String weakPassword(int length) {

        String password = new Random().ints(length, 97, 122).collect(StringBuilder::new,
                        StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return password;
    }



    public String strongPassword(int length) throws Exception {

        if (length<3)
        {
            throw new Exception("Length must greater than 2");
        }

        else
        {


            String password = new Random().ints(length - 3, 33, 126).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            password += new Random().ints(1, 48, 57).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            password += new Random().ints(1, 97, 122).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();

            password += new Random().ints(1, 33, 47).collect(StringBuilder::new,
                            StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString();


            return password;



        }


    }

    /*
     *   implement a function that checks if a integer is a fibobin number
     *   integer n is fibobin is there exist an i where:
     *       n = fib(i) + bin(fib(i))
     *   where fib(i) is the ith fibonacci number and bin(i) is the number
     *   of ones in binary format
     *   lecture 5 page 17
     */
    public boolean isFiboBin(int n) {


        int first = 0;  //for fibonacci
        int second = 1; //for fibonacci
        while(second <= n)
        {
            int third = first + second;

            if((n - second) == Integer.bitCount(third))
            {
                return true;
            }

            first = second;
            second = third;

        }
        return false;
    }





}
