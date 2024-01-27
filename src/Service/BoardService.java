package Service;

import Model.Board;
import Model.CellStatus;

public class BoardService {
    public void display(Board board){
        int len=board.getBoard().size();
        for(int i=0;i<len;i++){
            System.out.print("|");
            for(int j=0;j<len;j++){
                if(board.getBoard().get(i).get(j).getStatus().equals(CellStatus.EMPTY)){
                    System.out.print("-|");
                }
                else{
                    System.out.print(board.getBoard().get(i).get(j).getPlayer().getSymbol()+"|");
                }
            }
            System.out.println();
        }
    }
}
