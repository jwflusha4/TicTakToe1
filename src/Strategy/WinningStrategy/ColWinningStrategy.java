package Strategy.WinningStrategy;

import Model.*;

public class ColWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col=move.getCell().getCol();
        int len=board.getBoard().size();
        Player currPlayer=move.getCell().getPlayer();
        for(int i=0;i<len;i++){
            //Cell cell = board.getBoard().get(i).get(col);
            if (board.getBoard().get(i).get(col).getStatus().equals(CellStatus.EMPTY)) {
                return false;
            } else if (!board.getBoard().get(i).get(col).getPlayer().equals(currPlayer)) {
                return false;
            }
        }
        return true;
    }
}
//public boolean checkWinner(Board board, Move move) {
//    int columnToCheck = move.getCell().getCol();
//    Player player = move.getCell().getPlayer();
//
//    for (int i = 0; i < board.getBoard().size(); i++) {
//        Cell cell = board.getBoard().get(i).get(columnToCheck);
//        if (cell.getCellStatus().equals(CellStatus.EMPTY)
//                || !cell.getPlayer().equals(player)) {
//            return false;
//        }
//    }
//    return true;
//}
