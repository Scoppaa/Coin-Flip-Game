import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args)
    {
        String reflip = "";
        Scanner scan = new Scanner(System.in);
        double balance = 0;

        do {
            System.out.println("How much would you like to bet?");
            double bet = scan.nextDouble();

            System.out.println("Heads or Tails?");
            String guess = scan.next();

            Coin coin1 = new Coin();
            coin1.flip();

            if (guess.equals(coin1.toString())) {
                System.out.println(guess + "! You win: $" + bet);
                balance += bet;
            }
            else {
                System.out.println("You lose! Your balance has been reset");
                balance = 0;
            }
            System.out.println("Your balance: $" + balance);
            System.out.println("Play Again? Type Y for Yes, Type N for No");
            reflip = scan.next();

        } while(reflip.equals("Y"));

    }
}
