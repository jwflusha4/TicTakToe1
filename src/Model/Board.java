package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;
     public Board(int dimension){
         board=new ArrayList<>();
         for(int i=0;i<dimension;i++){
             board.add(new ArrayList<>());
             for(int j=0;j<dimension;j++){
                 board.get(i).add(new Cell(i,j));
             }
         }
     }
    public void display(){
        int len=board.size();
        for(int i=0;i<len;i++){
            System.out.print("|");
            for(int j=0;j<len;j++){
                if(board.get(i).get(j).getStatus().equals(CellStatus.EMPTY)){
                    System.out.print("-|");
                }
                else{
                    System.out.print(board.get(i).get(j).getPlayer().getSymbol()+"|");
                }
            }
            System.out.println();
        }
    }
    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
