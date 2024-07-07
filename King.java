public class King extends Piece {
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean canMove(Board board, int startX, int startY, int endX, int endY) {
        //King game strategy initialised
        return true;
    }
}

