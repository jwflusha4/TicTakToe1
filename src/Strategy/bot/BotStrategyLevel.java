package Strategy.bot;

import Model.Board;
import Model.Move;

public interface BotStrategyLevel {
    public Move makeMove(Board board);
}
