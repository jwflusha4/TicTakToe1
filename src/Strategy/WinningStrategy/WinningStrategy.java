package Strategy.WinningStrategy;

import Model.Board;
import Model.Move;

public interface WinningStrategy {
    public boolean checkWinner(Board board, Move move);

}
