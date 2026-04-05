import java.util.Scanner;

public class Tic_Tac_Toe {
    public static void main (String[] args) {
        char[][] board = new char[3][3];
        for(int row = 0 ; i < board.length();row++){
            for(int col = 0 ; i < board[row].length();col++){
                    board[row][col] = ' ';
        }   
        }
        
        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);

        while(!gameOver){
            System.out.println(board);
            System.out.println("Player " + player + " Enter : ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board,)
            }
            else {
                System.out.println("Invalid move , Try again ");
            }
        }
    }
}