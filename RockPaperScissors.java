import java.lang.Math;
public class RockPaperScissors {
        private String user;
        private String house;
        public RockPaperScissors(){
            int value1 = (int) (Math.random() * 3) + 1;
            if (value1 == 1){
                user = "Rock";
            }
            else if (value1 == 2){
                user = "Paper";
            }
            else{
                user = "Scissors";
            }
            int value2 = (int) (Math.random() * 3) + 1;
            if (value2 == 1){
                house = "Rock";
            }
            else if (value2 == 2){
                house = "Paper";
            }
            else{
                house = "Scissors";
            }
            if (user == "Rock"){
                if (house == "Paper"){
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you lose.");
                }
                else if (house == "Scissors"){
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you win!");
                }
                else{
                    System.out.println("You and the house both chose " + user + ", so it's a draw!");
                }
            }
            else if (user == "Paper"){
                if (house == "Paper"){
                    System.out.println("You and the house both chose " + user + ", so it's a draw!");
                }
                else if (house == "Scissors"){
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you lose.");
                }
                else{
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you win!");
                }
            }
            else{
                if (house == "Paper"){
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you win!");
                }
                else if (house == "Scissors"){
                    System.out.println("You and the house both chose " + user + ", so it's a draw!");
                }
                else{
                    System.out.println("You chose " + user + " and the house chose " + house + ", so you lose.");
                }
            }
    }
}