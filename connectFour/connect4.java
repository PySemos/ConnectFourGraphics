package connectFour;
import connectFour.Board;
import connectFour.Player;

public class connect4{
   public static void main(String[] args){
      Player player = new Player("S");
      Player player2 = new Player("J");
      Board board = new Board(player,player2);
      board.play(4,player2);
      board.play(4,player);
      board.play(4,player);
      board.play(4,player);
      board.play(4,player);
      board.play(5,player);
      board.play(5,player);
      board.play(5,player);
      board.play(6,player);
      board.play(6,player);
      board.play(7,player);
      board.print();
      System.out.println(board.won(player));
   }
}