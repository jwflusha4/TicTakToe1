package Strategy.bot;

import Model.Board;
import Model.Cell;
import Model.CellStatus;
import Model.Move;

public class EasyBotPlayingStrategy implements BotStrategyLevel {
    @Override
    public Move makeMove(Board board) {
        int len=board.getBoard().size();
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(board.getBoard().get(i).get(j).getStatus().equals(CellStatus.EMPTY)){
                    //Cell cell=new Cell(i,j);
                    return new Move(board.getBoard().get(i).get(j));
                }
            }
        }
        return null;
    }
}
