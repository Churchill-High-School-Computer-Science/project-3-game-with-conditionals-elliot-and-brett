import java.lang.Math;
import java.util.Scanner;
public class Blackjack{
    private int value;
    private int total;
    private boolean stand;
    private boolean bust;
    Scanner input = new Scanner(System.in);
    // finish bust
    public Start(){

    }
    public  String draw(){
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
                return "You drew a six!";
            }
            else if (card == 6){
                value = 7;
                total += value;
                return "You drew a seven!";
            }
            else if (card == 7){
                value = 8;
                total += value;
                return "You drew an eight!";
            }
            else {
                value = 9;
                total += value;
                return "You drew a nine!";
            }
        }
        else if (card >= 9 && card <= 12){
            if (card == 9){
                value = 10;
                total += value;
                return "You drew a ten!";
            }
            else {
                value = 10;
                total += value;
                return "You drew a face card!";
            }
        }
        else{
            System.out.println("You drew an ace! Do you want it to be a 1 or 11?");
            int value = input.nextInt();
            total += value;
        }
    }
}