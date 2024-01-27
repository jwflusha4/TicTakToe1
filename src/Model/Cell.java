package Model;

public class Cell {
    private int row;
    private int col;
    private CellStatus status;
    Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.status=CellStatus.EMPTY;
    }

    public Cell(int row, int col, CellStatus status, Player player) {
        this.row = row;
        this.col = col;
        this.status = status;
        this.player = player;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellStatus getStatus() {
        return status;
    }

    public void setStatus(CellStatus status) {
        this.status = status;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
