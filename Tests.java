public class Tests{
    public static void main(String [] args){
        //test cases for NimRunner (base cases)
        System.out.println(1 == NimRunner.minimax(0, true));
        System.out.println(-1 == NimRunner.minimax(0, false));
    }
}