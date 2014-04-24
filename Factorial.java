package factorial;
 public class Factorial{
 public static void main(String[] args) {

        System.out.println(calc(10));
 }

  public static long calc(long n){
    if (n <= 1)
        return 1;

        else

            return n * calc(n-1);
  }

 }
