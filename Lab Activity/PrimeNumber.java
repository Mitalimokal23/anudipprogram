public class Mains {

  public static void main(String[] args) {

    int num = 2, i = 2;
    int  counter = 0;
    while (i <= num / 2) {
     
      if (num % i == 0) {
        counter = 1;
        break;
      }

      ++i;
    }

    if (counter == 1)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}