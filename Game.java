package ConnectFourGraphic;
import connectFour.Player;
import connectFour.Board;
import javax.swing.*;
import java.awt.event.*;


public class Game extends JFrame{
   Board board;
   public Game(Player player,Player player2){
      this.board = new Board(player,player2);
      super();
      this.setSize(board.size,board.size);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      this.setLayout(new GridLayout(8,8));
   }

}