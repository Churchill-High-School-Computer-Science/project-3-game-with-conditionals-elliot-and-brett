import java.lang.Math;
import java.util.Scanner;
public class Blackjack{
    private int value;
    private int total;
    private int dealer;
    private int cardHidden;
    private boolean stand;
    private boolean bust;
    private boolean win;
    Scanner input = new Scanner(System.in);
    public Blackjack(){
        stand = false;
        bust = false;
        total = 0;
        dealer = 0;
        value = 0;
        win = false;
        int card1 = (int) (Math.random() * 13) + 1;
        int card2 = (int) (Math.random() * 13) + 1;
        if (card1 < 9){
            total += card1;
            total +=1;
        }
        else if (card1 >= 10 && card1 <= 12){
            total += 10;
        }
        else{
            System.out.println("You drew an ace! Do you want it to be a 1 or 11?");
            int value = input.nextInt();
            total += value;
            input.nextLine();
        }
         if (card2 < 9){
            total += card2;
            total += 1;
        }
        else if (card2 >= 10 && card2 <= 12){
            total += 10;
        }
        else{
            System.out.println("You drew an ace! Do you want it to be a 1 or 11?");
            int value = input.nextInt();
            total += value;
            input.nextLine();
        }
        int card3 = (int) (Math.random() * 13) + 1;
        cardHidden = (int) (Math.random() * 13) + 1;
        if (card3 < 9){
            dealer += card3;
            dealer ++;
            System.out.println("The dealer has a " + (card3 + 1) + " showing.");
        }
        else if (card3 >= 10 && card3 <= 12){
            dealer += 10;
            System.out.println("The dealer has a face card showing.");
        }
        else{
            dealer += 11;
            System.out.println("The dealer has an ace showing.");
        }
        if (cardHidden < 9){
            dealer += cardHidden;
            dealer += 1;
        }
        else if (cardHidden >= 10 && cardHidden <= 12){
            dealer += 10;
        }
        else{
            dealer += 11;
        }
        if (total == 21){
            win = true;
            System.out.println("Congrats you got blackjack and won!");
        }
        else{
        System.out.println("Your starting total is " + total);
        }
    }

    public String draw()
    {
        while (stand != true && bust != true && win != true){
            System.out.println("Hit or Stand?");
            String standing = input.nextLine();
            if (standing.equals("Stand")){
                stand = true;
                return "your final total is " + total;
            }
            else{
                int card = (int) (Math.random() * 13) + 1;
                if (card < 8){
                    if (card == 1){
                        value = 2;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a two!");
                        }
                        else{
                            bust = true;
                            return "You drew a two and busted!";
                        }
                    }
                    else if (card == 2){
                        value = 3;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a three!");
                        }
                        else{
                            bust = true;
                            return "You drew a three and busted!";
                        }
                    }
                    else if (card == 3){
                        value = 4;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a four!");
                        }
                        else{
                            bust = true;
                            return "You drew a four and busted!";
                        }
                    }
                    else if (card == 4){
                        value = 5;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a five!");
                        }
                        else{
                            bust = true;
                            return "You drew a five and busted!";
                        }
                    }
                    else if (card == 5){
                        value = 6;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a six!");
                        }
                        else{
                            bust = true;
                            return "You drew a six and busted!";
                    }
                    }
                    else if (card == 6){
                        value = 7;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a seven!");
                        }
                        else{
                            bust = true;
                            return "You drew a seven and busted!";
                    }
                    }
                    else if (card == 7){
                        value = 8;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew an eight!");
                        }
                        else{
                            bust = true;
                            return "You drew an eight and busted!";
                    }
                    }
                    else {
                        value = 9;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a nine!");
                        }
                        else{
                            bust = true;
                            return "You drew a nine and busted!";
                    }
                }
                    }
                else if (card >= 9 && card <= 12){
                    if (card == 9){
                        value = 10;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a ten!");
                        }
                        else{
                            bust = true;
                            return "You drew a ten and busted!";
                    }
                    }
                    else {
                        value = 10;
                        total += value;
                        if (total <= 21){
                        System.out.println("You drew a face card!");
                        }
                        else{
                            bust = true;
                            return "You drew a face card and busted!";
                    }
                    }
                }
                else{
                    System.out.println("You drew an ace! Do you want it to be a 1 or 11?");
                    int value = input.nextInt();
                    total += value;
                    input.nextLine();
                    if (total <= 21){
                        System.out.println("Lucky ace!");
                        }
                    else{
                        bust = true;
                        return "Unlucky ace, you busted!";
                }
            }
            }
            }
            return "You can't draw anymore, the game is already over";
        }
        public String end(){
            if (win == true){
                return "Congrats on the win, the dealer's cards don't matter because you have blackjack";
            }
            else if(bust == true){
                return "Sorry you busted so you already lost.";
            }
            else{
                if (cardHidden < 9){
                    System.out.println("The dealer reveals a " + (cardHidden + 1) + ".");
                }
                else if (cardHidden >= 10 && cardHidden <= 12){
                    System.out.println("The dealer reveals a face card.");
                }
                else{
                    System.out.println("The dealer reveals an ace.");
                    }
                System.out.println("That brings the dealers starting total to " + dealer + ".");
                while (dealer < 17){
                    int card = (int) (Math.random() * 13) + 1;
                    if (card == 1){
                        dealer += 2;
                        System.out.println("The dealer drew a two!");
                        }
                    else if (card == 2){
                        dealer += 3;
                        System.out.println("The dealer drew a three!");
                    }
                    else if (card == 3){
                        dealer += 4;
                        System.out.println("The dealer drew a four!");
                    }
                    else if (card == 4){
                        dealer += 5;
                        System.out.println("The dealer drew a five!");
                    }
                    else if (card == 5){
                        dealer += 6;
                        System.out.println("The dealer drew a six!");
                    }
                    else if (card == 6){
                        dealer += 7;
                        System.out.println("The dealer drew a seven!");
                    }
                    else if (card == 7){
                        dealer += 8;
                        System.out.println("The dealer drew an eight!");
                    }
                    else if (card == 8){
                        dealer += 9;
                        System.out.println("The dealer drew a nine!");
                    }
                    else if (card == 9){
                        dealer += 10;
                        System.out.println("The dealer drew a ten!");
                    }
                    else if (card >= 10 && card <= 12){
                        dealer += 10;
                        System.out.println("The dealer drew a face card!");
                    }
                    else { 
                        dealer += 11;
                        if (dealer > 21){
                            dealer -= 10;
                            System.out.println("The dealer drew an ace, it is valued at 1");
                        }
                        else{
                            System.out.println("The dealer draw an ace, it is valued at 11");
                        }
                    }
                }
                if (dealer > 21){
                    return "The dealer busted so you win!";
                }
                else if (dealer < total){
                    return "You beat the dealer, congrats!";
                }
                else if (dealer > total){
                    return "The dealer beat you, sorry.";
                }
                else{
                    return "It's a draw.";
                }
                    }
                }
}