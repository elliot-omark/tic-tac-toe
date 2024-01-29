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
    private boolean isTie= false;
    private boolean isWinner=false;
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
    public void setBoardCell(int col, int row, int value){
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
        return this.isTie;
    }
    public boolean isWinner(){
        return this.isWinner;
    }
}
