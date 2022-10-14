package connectFour;

// Red vs Blue

import connectFour.Player;

public class Board{
   private int size = 8;
   private String[][] board;
   private String nonPlayedPosition = "-";
   private Boolean terminated = false;
   public Player[] players;
   public Board(Player player1, Player player2){
      players = new Player[2];
      players[0] = player1;
      players[1] = player2;
      board = new String[size][size];
      for(int i = 0;i<size;i++){
           for(int j = 0;j<size;j++){
               board[i][j] = nonPlayedPosition;
           }
      }
   }
   public void print(){
       for(int i = 0;i<size;i++){
           for(int j = 0;j<size;j++){
               System.out.print(board[i][j] + " ");
           }
           System.out.println("");
      }        
   }
   
   private Boolean PlayerInGame(Player player){
        for(Player pl:players){
               if (pl == player){
                  return true;
               }
        }
        return false;
   }
   
   public void play(int position,Player player){
      //System.out.println(PlayerInGame(player);
      if (PlayerInGame(player)){
         if (position>=0 && position <8){
            for(int i = 0;i<size;i++){
               if (board[i][position] == nonPlayedPosition ){
                  if (i == size-1){
                     board[i][position] = player.representation;
                     break;
                   }
               }
               if (board[i][position] != nonPlayedPosition){
                     if(i>=1){
                          board[i-1][position] = player.representation;
                          break;
                     }
                  }
            }
         }
         }
         else{
             return;
         }
      }
      
   private Boolean wonHorizontal(Player player,int index){
      if (index>=0 && index <size){
         for(int i=0;i<size-3;i++){
            if(player.representation == board[index][i] && player.representation == board[index][i+1] && player.representation == board[index][i+2] && player.representation == board[index][i+3]){
                  return true;
            }
         }
         return false;
      }
      else{
         System.out.println("Index Error");
         return false;
      }
   }
   
   private Boolean wonVertical(Player player,int column){
      if (column>=0 && column < size){
         for(int i=0;i<size-3;i++){
            if(player.representation == board[i][column] && player.representation == board[i+1][column] && player.representation == board[i+2][column] && player.representation == board[i+3][column]){
                  return true;
            }
         }
         return false;
      }
      else{
         System.out.println("Index Error");
         return false;
      }
   }
   
   private Boolean wonDiagonal(Player player){
         for(int i = 0;i<size-3;i++){
            //Down
            for(int j=0;j<size-3;j++){
               if(player.representation== board[i][j] && player.representation == board[i+1][j+1] && player.representation== board[i+2][j+2] && player.representation== board[i+3][j+3]){
                     return true;
               }
            }
            //Up
            for(int j=size-1;j>2;j--){
               // I am missing thid sentence
               if(player.representation == board[i][j] && player.representation == board[i+1][j-1] && player.representation== board[i+2][j-2] && player.representation== board[i+3][j-3]){
                  return true;
               }
               }
            }
         return false;
         }
   public Boolean won(Player player){
         // Horizontal
         for(int i = 0;i<size;i++){
            if(wonHorizontal(player,i)){
               System.out.println("Won row: " + Integer.toString(i));
               return true;
            }
         }
         // Vertical
         for(int j = 0;j<size;j++){
               if(wonVertical(player,j)){
                  System.out.println("Won column: " + Integer.toString(j));
                  return true;
               }
         }
         if(wonDiagonal(player)){
            System.out.println("Won Diagonal: ");
            return true;
         }
         return false;
   }
      

   }
   

