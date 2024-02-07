package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
    public void setGameState(int gameState){
        this.gameState=gameState;
    }

    public int getGameState(){
        return this.gameState;
    }

    public int getWhoseMove(){
        return this.whoseMove;
    }

    public void setWhoseMove(int whoseMove){
        this.whoseMove=whoseMove;
    }

    public int getBoardCell(int row, int col){
        return this.board[row-1][col-1];
    }

    public void setBoardCell(int row, int col, int value){
        this.board[row-1][col-1]=value;
    }

    public String getPlayerName(){
        return this.xName;
    }

    public String getXName(){
        return this.xName;
    }

    public void setXName(String xName){
        this.xName=xName;
    }

    public void setOName(String oName){
        this.oName=oName;
    }

    public String getOName(){
        return this.oName;
    }

    public boolean isTie(){
        boolean zero=false;
        int zeros=0;
        for (int i=0; i< 3; i++) {           
            for (int x=0;x<3;x++){
                
                if (this.board[i][x]!=0){
                    if (zero==true&&Math.abs(this.board[0][i]+this.board[0][i]+this.board[0][i])!=3){
                        if (zero==true&&Math.abs(this.board[i][0]+this.board[i][0]+this.board[i][0])!=3){

                            if (i==2){
                                return true;
                            }

                        }
                    }
                    i++;
                    if (zeros==9){
                        zero=true;
                    }
                }
            }
        }
        return false;

    }

    public boolean isWinner(){
        for (int i=0; i< 3; i++) {
            if (Math.abs(this.board[i][0] + this.board[i][1] + this.board[i][2]) == 3) {
                return true;
            }
            if (Math.abs(this.board[0][i]+ this.board[1][i] + this.board[2][i]) == 3) {
                return true;
            }
            if (Math.abs(this.board[0][2]+this.board[1][1]+this.board[2][0])==3){
                return true;
            }
            if (Math.abs(this.board[0][0]+this.board[1][1]+this.board[2][2])==3){
                return true;
            }
        }

        return false;
    }
}
