public class Tests{
    public static void main(String [] args){
        //test cases for NimRunner (base cases)
        System.out.println(1 == NimRunner.minimax(0, true));
        System.out.println(-1 == NimRunner.minimax(0, false));
        System.out.println(NimRunner.runGame(6));
        System.out.println(NimRunner.minimax(2, false) == -1); //true
        System.out.println(NimRunner.minimax(3, false) == 1); //true
        System.out.println(NimRunner.bestMove(1, false));
        System.out.println(NimRunner.bestMove(4, true)); //the best case scenario would be 3 pieces to take
        System.out.println(NimRunner.runGame(5)); //true
        System.out.println(NimRunner.runGame(4)); //true

    }
}