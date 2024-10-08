
import java.util.Scanner;
public class Working{
    public static void main(String[] args0){
        Blackjack game1 = new Blackjack();
        System.out.println(game1.draw());
        System.out.println(game1.end());
        wordle w = new wordle();
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 5){
        System.out.println("Guess the 5 letter word: ");
        String Guess = input.next();
        w.guess(Guess);
        System.out.println(w.correct());
        count = count + 1;
        w.reset_letter();
        //if (w.check_win() == true)
            break;
        
        }
    }
}

