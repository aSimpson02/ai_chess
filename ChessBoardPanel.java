import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class ChessBoardPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBoard(g);
        drawPieces(g);
    }

    private void drawBoard(Graphics g) {
        int tileSize = getWidth() / 8;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.GRAY);
                }
                g.fillRect(col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }
    }

    private void drawPieces(Graphics g) {
        int tileSize = getWidth() / 8;

        //eg of drawing  a king
        drawKing(g, 4, 7, tileSize);


    }

    private void drawKing(Graphics g, int x, int y, int tileSize) {
        g.setColor(Color.BLACK);
        g.fillOval(x * tileSize + tileSize / 4, y * tileSize + tileSize / 4, tileSize / 2, tileSize / 2);
    }
}
