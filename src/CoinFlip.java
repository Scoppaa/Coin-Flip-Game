import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args)
    {
        //Variable initilization and instantiation
        String reflip = "";
        Scanner scan = new Scanner(System.in);

        //Initilize balance to 0
        double balance = 0;

        //Creates coin
        Coin coin1 = new Coin();

        do {
            //Betting prompt
            System.out.println("How much would you like to bet?");
            double bet = scan.nextDouble();

            //Coin flip guess prompt
            System.out.println("Heads or Tails?");
            String guess = scan.next();

            //Coin flip
            coin1.flip();

            //If users guess equals the coin
            if (guess.equals(coin1.toString())) {
                System.out.println(guess + "! You win: $" + bet); //User wins
                balance += bet * 2; //Returns the users bet and adds winnings to their balance
            }
            else {
                System.out.println("You lose! Your balance has been reset"); //User loses
                balance = 0; //Users balance is reset to 0 since they lost
            }
            System.out.println("Your balance: $" + balance); //The users balance is outputted

            //Prompts user to play again
            System.out.println("Play Again? Type Y for Yes, Type N for No");
            reflip = scan.next();

        } while(reflip.equals("Y"));

    }
}
