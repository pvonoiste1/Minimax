import java.util.*;
public class NimRunner{
    public static void main(String[] args){

    }

    public static boolean runGame(){
        //hard code the number of pieces
        int pieces = 6;
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
        if (state == 0 && myTurn){ //base case 1
            return 1;
        }
        else if(state == 0 && !myTurn){ //base case 2
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
            if(i<= state){
                score = minimax(state-1, myTurn); //recursive element, call minimax to test that move and to save the cosre
                if(myTurn && score == 1){
                    return i;
                }
                else if(!myTurn && score == 1){
                    return i;
                }
            }
        }
        //if you never get 1 or -1, return a random move
        return 3;
    }

}