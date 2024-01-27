package Model;

public class Move {
    private int moveId;
    private Cell cell;

    public Move(Cell cell) {
        this.cell = cell;
    }

    public int getMoveId() {
        return moveId;
    }

    public void setMoveId(int moveId) {
        this.moveId = moveId;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
