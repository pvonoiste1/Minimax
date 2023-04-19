public class NimRunner{
    public static void main(String[] args){

    }

    public static boolean runGame(){
        //hard code the number of pieces
        int numPieces = 6;
        //returning the value of who won
        while(numPieces>0){
            int xMove = getXMove(numPieces);
            numPieces = numPieces-xMove;
            int yMove = getYMove(numPieces);
            numPieces = numPieces-yMove;
        }
    }

    public static int getXMove(int numPieces){
        //return the number of pieces that you take (from 0-3)
        int chosenInt = Math.floor(Math.random()*(3-1+1));
        return chosenInt;

    }

    public static int getYMove(int numPieces){
        //return the number of pieces that you take (from 0-3)
        int chosenInt = Math.floor(Math.random()*(3-1+1));
        return chosenInt;

    }

    public void display(){
        
    }

}