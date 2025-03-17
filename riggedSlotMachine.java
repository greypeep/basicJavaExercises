import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        String flag="";
        short casinoMoney = 1000;
        System.out.println("Welcome to our totally fair slot machine,wanna give it a try?");
        System.out.println("Deposit the money you want to gamble: ");
        short balance = scanner.nextShort();
        while (balance < 0) {
            System.out.println("What a funny joker you are,insert a valid amount or your money will be considered a kind donation!!");
            System.out.println("Deposit the money you want to gamble: ");
            balance = scanner.nextShort();
    }
        short bet = 0;
        short winnings = 0;
        while (!(flag.equals("quit"))) {
            bet = gamba_bet(bet,balance,scanner);
            balance -= bet;
            casinoMoney += bet;
            winnings = gamba_roulette(bet,casinoMoney,random);
            balance+= winnings;
            casinoMoney-=winnings;
            System.out.println(balance);
            System.out.println("Do you wish to gamble again or quit? again/quit");
            flag = scanner.next();

        }
    //Select our variables
    //Display welcome message
    //Play if balance > 0
        //Enter bet ammount:
        //->Verify if bet is greater than balance(cant bet)
        //->verify if bet is > 0(cant bet negative)
        //subtract bet from balance
        //spin the slot machine
        //print row
        //get payout if win(add to balance)
        //ask if user wants to play again
        //display exit message

    scanner.close();
}
static short gamba_bet(short bet,short balance,Scanner scanner) {
    System.out.println("How many money you wish to gamble on this bet? ");
    bet = scanner.nextShort();
    while (bet > balance || bet < 0) {
        System.out.println("Trying to break the system?Insert a valid ammount according to what is avaiable on ur balance");
        System.out.println("This is what is avaiable: "+balance);
        System.out.println("Now how much you are gambling in this bet? ");
        bet = scanner.nextShort();
    }
    System.out.println("Now that is a valid bet!");
    return bet;
}
static short gamba_roulette(short bet,short casinoMoney,Random random) {
        int random1;
        String[] outcomes = {"\uD83D\uDCA2","\uD83E\uDDDF\u200D♂\uFE0F","\uD83C\uDFC2"};
        String[] match =new String[3];
        short count=0;
        if (bet > (casinoMoney/2) || bet*3 > (casinoMoney/2)) {
            System.out.print("\uD83D\uDCA2");
            System.out.print("\uD83E\uDDDF\u200D♂\uFE0F");
            System.out.println("\uD83C\uDFC2");
            System.out.println("You lost!!!");
            return 0;
        } else if (bet == 42) {
            for(int i = 0;i<3;i++) {
                System.out.print("\uD83D\uDCA2");
            }
            System.out.println("\n Congratulations,you won 126 buckaroos!!");
            return 126;
        } else {
            for (int x=0;x<3;x++) {
                random1=random.nextInt(1,4);
                switch (random1) {
                    case 1 -> {
                        match[x] = "\uD83D\uDCA2";
                        System.out.print(match[x]);
                    }
                    case 2 -> {
                        match[x] = "\uD83E\uDDDF\u200D♂\uFE0F";
                        System.out.print(match[x]);
                    }
                    case 3 -> {
                        match[x] ="\uD83C\uDFC2";
                        System.out.print(match[x]);
                    }
                }
            }
            for(int j=0;j<3;j++) {
                for(int h=0;h < match.length ;h++) {
                    if(match[j].equals(match[h])) {
                        count=(short)(count+1);
                    }
                }
            }
            count = (short) (count-3);
            if ( count > 0) {
                System.out.println("\n Congratulations you win "+ (bet*count));
            } else {
                System.out.println("\n Thanks for your kind donation,since you lost :)");
            }
        }
        return (short)(bet * count);
    }
}

