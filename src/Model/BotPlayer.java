package Model;

import Strategy.bot.BotPlayingStrategyFactory;
import Strategy.bot.BotStrategyLevel;

public class BotPlayer extends Player{

    public BotPlayer(String name, char symbol, int id,
                     PlayerType playerType,
                     BotDifficultyLevel botDifficultyLevel){
        super(name,symbol,id,playerType);
        this.botDifficultyLevel=botDifficultyLevel;
        this.botStrategyLevel= BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }
    BotDifficultyLevel botDifficultyLevel;
    BotStrategyLevel botStrategyLevel;


    public Move makeMove(Board board){
        Move move=this.botStrategyLevel.makeMove(board);
        if(move==null){
            return null;
        }
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        if(board.getBoard().get(row).get(col).getStatus().equals(CellStatus.EMPTY)){
            System.out.println("bot "+this.getName()+" name a move on "+row+", "+col);
            board.getBoard().get(row).get(col).setPlayer(this);
            board.getBoard().get(row).get(col).setStatus(CellStatus.OCCUPIED);
            return move;
        }
        return null;
    }
}
