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
    public int[][] getBoardCell(){
        return this.board;
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
    
}
