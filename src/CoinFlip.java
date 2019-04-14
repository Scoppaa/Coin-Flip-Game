import java.util.Scanner;

public class CoinFlip {

    public static void main(String[] args)
    {
        //Variable initilization and instantiation
        String reflip = "";
        Scanner scan = new Scanner(System.in);
        String guess = "";

        //Initilize balance to 100
        double balance = 100;
        System.out.println("Welcome to Coin Flip! $100 has been deposited into your account to get started!");

        //Creates coin
        Coin coin1 = new Coin();

        do {
            //Betting prompt
            System.out.println("How much would you like to bet? Current Balance: $" + balance);
            double bet = scan.nextDouble();

            //Coin flip
            coin1.flip();

            //if user has enough money in their balance
            if (bet <= balance) {
                //Coin flip guess prompt
                System.out.println("Heads or Tails?");
                guess = scan.next();

                if (guess.equals(coin1.toString())) { //If users guess equals the coin
                    balance += bet * 2; //Returns the users bet and adds winnings to their balance
                    System.out.println(guess + "! You win: $" + bet); //User wins
                } else {
                    System.out.println("You lose! Your balance has been reset to $100 to continue playing"); //User loses
                    balance = 100; //Users balance is reset to 0 since they lost
                }
            }
            else
                System.out.println("You don't have enough money");

            System.out.println("Your balance: $" + balance); //The users balance is outputted

            //Prompts user to play again
            System.out.println("Play Again? Type Y for Yes, Type N for No");
            reflip = scan.next();


        } while(reflip.equals("Y"));

    }
}
