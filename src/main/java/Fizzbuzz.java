public class Fizzbuzz {

    private static String fizzbuzz(int i) {
        if (i % 3 == 0)
            if (i % 5 == 0)
                return "FizzBuzz";
            else return "Fizz";
        else if (i % 5==0)
            return "Buzz";
        else
            return ""+i;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++ ) {
            System.out.println(i + ": " + fizzbuzz(i));
        }
    }
}


