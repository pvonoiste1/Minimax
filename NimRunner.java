import java.util.*;
public class NimRunner{

    public static boolean runGame(int pieces){
        //hard code the number of pieces through user input
        //Optional: change to make an array (ex. 1,3,5,7)
        //start xWins with true
        boolean xWins = true;
        //returning the value of who won
        while(pieces>0){ //update the pieces based on X and Y moves
            if (pieces == 0){ 
            pieces -= getXMove(pieces);
            xWins = false; //make xWins false to change the state after each turn
            }
            pieces -= getYMove(pieces); //get the move that Y will make
            if (pieces == 0){
                break; 
            }
        }
        //return whethe or not our player, player X, wins the game
        return xWins; 
    }

    public static int getXMove(int numPieces){
        //return the number of pieces that you take (from 0-3)
        return bestMove(numPieces, true); //call bestMove

    }

    public static int getYMove(int numPieces){
        //return the number of pieces that you take (from 0-3)
        return bestMove(numPieces, false); //call bestMove

    }

    public static int minimax(int state, boolean myTurn){
        if (state == 0 && myTurn){ //base case #1 (its your turn and there are no pieces)-you won
            return 1;
        }
        else if(state == 0 && !myTurn){ //base case #2 (its not your turn and there are no pieces)-you lost
            return -1;
        }
        else{
            ArrayList<Integer> scores = new ArrayList<> (); //create an AL to hold all of the possible scores
            for(int i = 1; i<4; i++){
                if(i<=state){
                    scores.add(minimax(state-i, !myTurn));
                }
            }

            //set default values to max and min
            int min = scores.get(0); 
            int max = scores.get(0);
            //iterate through the size of sizes
            for(int j = 0; j<scores.size(); j++){
                if(myTurn && scores.get(j)>max){
                    max = scores.get(j);
                }
                else if(!myTurn && scores.get(j) < min ){
                    min = scores.get(j);
                }
            }
            if(myTurn){ // if it your turn, maximize
                return max;
            }
            else{ // if it is not your turn, minimize
                return min;
            }
        }    
    }

    public static int bestMove(int state, boolean myTurn){
        //returns how many pieces is optimal to take
        int score = 0; //hold the score given by each move
        for(int i=1; i<4; i++){
            if(i<=state){ 
                score = minimax(state-i, !myTurn); //recursive element, call minimax to test that move and to save the cosre
                if(myTurn && score == 1){
                    return i; //exit once you have found the move that is equal to 1
                }
                else if(!myTurn && score == -1){ //exit once you have the move that is equal to -1
                    return i;
                }
            }
        }
        //if you never get 1 or -1, return only taking one move
        return 1;
    }

    //Optional: USER INPUT

}