package Strategy.WinningStrategy;

import Model.Board;
import Model.CellStatus;
import Model.Move;
import Model.Player;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row=move.getCell().getRow();
        int len=board.getBoard().size();
        Player currPlayer=move.getCell().getPlayer();
        for(int i=0;i<len;i++){
            if(board.getBoard().get(row).get(i).getStatus().equals(CellStatus.EMPTY)||
                    !board.getBoard().get(row).get(i).getPlayer().equals(currPlayer)){
                return false;
            }
        }
        return true;
    }
}
