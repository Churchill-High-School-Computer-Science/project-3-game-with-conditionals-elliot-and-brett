
import java.util.Scanner;
public class Working{
    public static void main(String[] args0){
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to play Blackjack, Rock Paper Scissors, or Wordle?");
        String game = input.nextLine();
        if (game.equals("Wordle")){
            System.out.println("X means the letter is not in the word, - means the letter is in the word but not in the right place, and y means the letter is in the word and in the right spot.");
            wordle w = new wordle();
            int count = 0;
            while (count < 5){
            System.out.println("Guess the 5 letter word: ");
            String Guess = input.next();
            w.guess(Guess);
            System.out.println(w.correct());
            count = count + 1;
            w.reset_letter();
            if (w.check_win() == true ){
                break;
            }
            }
            System.out.println(w.ending());
        }    
            
            
        else if (game.equals("Blackjack")){
            Blackjack game1 = new Blackjack();
            System.out.println(game1.draw());
            System.out.println(game1.end());
        }
        else if (game.equals("Rock Paper Scissors")){
            RockPaperScissors first = new RockPaperScissors();
        }
        else{
            System.out.println("Sorry I don't recognize that game");
        }
    }
}


