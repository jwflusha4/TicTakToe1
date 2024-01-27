package Strategy.WinningStrategy;

import Model.*;

public class DiagonalWinningStrategy implements WinningStrategy{

    @Override
    public boolean checkWinner(Board board, Move move) {
        Player currentPlayer  = move.getCell().getPlayer();
        int len = board.getBoard().size();
        Player currPlayer=move.getCell().getPlayer();
        for (int i = 0; i < len; i++) {
            if (board.getBoard().get(i).get(i).getStatus().equals(CellStatus.EMPTY)) {
                break;
            } else if (!board.getBoard().get(i).get(i).getPlayer().equals(currPlayer)) {
                break;
            }
            if (i == len - 1) {
                return true;  // Diagonal is filled with the currentPlayer's moves
            }
        }

        // Check top-right to bottom-left diagonal
        for (int i = 0, j = len - 1; i < len && j >= 0; i++, j--) {
            if (board.getBoard().get(i).get(j).getStatus().equals(CellStatus.EMPTY)) {
                break;
            } else if (!board.getBoard().get(i).get(j).getPlayer().equals(currPlayer)) {
                break;
            }
            if (i == len - 1) {
                return true;  // Diagonal is filled with the currentPlayer's moves
            }
        }
        return false;
    }
}
