import java.lang.Math;
import java.util.Scanner;
public class wordle{
    String[] word = { "Types" , "Ghent", "Brett", "Lunch"};
    String wordl = word[(int) (Math.floor(Math.random()* 5))];
    private String Guess;

    public String guess(String guess) {
        Guess = guess;
    }

    public String correct(){
        
        if (Guess.substring(0,1).equals(word.substring(0,1))){
            return "Your first letter is in the correct place";
        }
        else if (Guess.substring(1,2).equals(word.substring(1,2))){
            return "Your second letter is in the correct place";
        }
        else if (Guess.substring(2,3).equals(word.substring(2,3))){
            return "Your third letter is in the correct place";
        }
        else if (Guess.substring(3,4).equals(word.substring(3,4))){
            return "Your fourth letter is in the correct place";
        }
        else if (Guess.substring(4,5).equals(word.substring(4,5))){
            return "Your fifth letter is in the correct place";
        }
        else;
            return "You had nothing correct.";
        }
    }
    public String close(){
        
    }
    
}