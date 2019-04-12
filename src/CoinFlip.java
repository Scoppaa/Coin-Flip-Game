import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Heads or Tails?");
        String guess = scan.next();

        Coin coin1 = new Coin();
        coin1.flip();

        if (guess.equals(coin1.toString()))
            System.out.println("You win!");
        else
            System.out.println("You lose!");

        /*
        System.out.println("The coin reads..." + coin1.toString().toUpperCase() + "!");
        if (coin1.isHeads())
            System.out.println("You win!");
        else
            System.out.println("You lose!");
            */

    }
}
