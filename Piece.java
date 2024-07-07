public abstract class Piece {
    boolean white;

    public Piece(boolean white) {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract boolean canMove(Board board, int startX, int startY, int endX, int endY);
}
