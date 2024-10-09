import java.lang.Math;
import java.util.Scanner;
public class wordle{
    String[] word = { "types" , "ghent", "brett", "lunch"};
    private String wordl = word[(int) (Math.floor(Math.random()* 4))];
    private String Guess;
    private String letter = "";
    
    public void guess(String guess1) {
        Guess = guess1;
    }

    public String correct(){
        
        if (wordl.indexOf(Guess.substring(0,1)) >= 0 ){
            if (Guess.substring(0,1).equals(wordl.substring(0,1))){
                letter += "Y";
            }
            else{
                letter += "-";
            }
        }
        else{
            letter += "X";
        }

        if (wordl.indexOf(Guess.substring(1,2)) >= 0 ){
            if (Guess.substring(1,2).equals(wordl.substring(1,2))){
                letter += "Y";
            }
            else{
                letter += "-";
            }
        }
        else{
            letter += "X";
        }

        if (wordl.indexOf(Guess.substring(2,3)) >= 0 ){
            if (Guess.substring(2,3).equals(wordl.substring(2,3))){
                letter += "Y";
            }
            else{
                letter += "-";
            }
        }
        else{
            letter += "X";
        }

        if (wordl.indexOf(Guess.substring(3,4)) >= 0 ){
            if (Guess.substring(3,4).equals(wordl.substring(3,4))){
                letter += "Y";
            }
            else{
                letter += "-";
            }
        }
        else{
            letter += "X";
        }

        if (wordl.indexOf(Guess.substring(4,5)) >= 0 ){
            if (Guess.substring(4,5).equals(wordl.substring(4,5))){
                letter += "Y";
            }
            else{
                letter += "-";
            }
        }
        else{
            letter += "X";
        }
        if (letter.equals("YYYYY")){    
            return "You got the word right";        
        }            
        else{
            return letter;
        }
            
    }

    public void reset_letter(){
        letter = "";
    }
    public boolean check_win(){
        if (wordl.equals(Guess)){
            return true;
        }
        else{
            return false;
        }
    }
    public String ending(){
        return "The word was " + wordl;
    }
}