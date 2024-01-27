package Model;

import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private int id;
    PlayerType playerType;

    public Player(String name,char symbol,int id,PlayerType playerType){
        this.name=name;
        this.symbol=symbol;
        this.id=id;
        this.playerType=playerType;
    }
    public Move makeMove(Board board){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row value and column value : "+this.getName());
        int row,col;
        row=sc.nextInt();
        col=sc.nextInt();
        Cell cell=board.getBoard().get(row).get(col);
        if(cell.getStatus().equals(CellStatus.EMPTY)){
            cell.setPlayer(this);
            cell.setStatus(CellStatus.OCCUPIED);
        }
        return new Move(cell);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
