import java.lang.Math;
import java.util.Scanner;
public class Blackjack{
    private int value;
    private int total;
    private int dealer;
    private boolean stand;
    private boolean bust;
    private boolean win;
    Scanner input = new Scanner(System.in);
    // finish bust
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
        }
        int card3 = (int) (Math.random() * 13) + 1;
        int card4 = (int) (Math.random() * 13) + 1;
        if (card3 < 9){
            dealer += card3;
            System.out.println("The dealer has a " + card3 + " showing.");
        }
        else if (card3 >= 10 && card3 <= 12){
            dealer += 10;
            System.out.println("The dealer has a face card showing.");
        }
        else{
            total += 11;
            System.out.println("The dealer has an ace showing.");
        }
        if (card4 < 9){
            dealer += card4;
            dealer += 1;
        }
        else if (card4 >= 10 && card4 <= 12){
            dealer += 10;
        }
        else{
            total += 11;
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
            String standing = input.next();
            if (standing.equals("Stand")){
                stand = true;
            }
            if (stand == true){
                return "your final total is " + total;
            }
            else{
                int card = (int) (Math.random() * 13) + 1;
                if (card < 8){
                    if (card == 1){
                        value = 2;
                        total += value;
                        if (total <= 21){
                        return "You drew a two!";
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
                        return "You drew a three!";
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
                        return "You drew a four!";
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
                        return "You drew a five!";
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
                        return "You drew a six!";
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
                        return "You drew a seven!";
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
                        return "You drew an eight!";
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
                        return "You drew a nine!";
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
                        return "You drew a ten!";
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
                        return "You drew a face card!";
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
                    if (total <= 21){
                        return "Lucky ace!";
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

        }
}