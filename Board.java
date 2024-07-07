public class Board {
    Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        //showing/defiing pieces on board
    }

    public boolean movePiece(int startX, int startY, int endX, int endY) {
        //moving piece if valis
        return true;
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }

    public void printBoard() {
        //showing board on console
    }
}
