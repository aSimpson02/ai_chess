import javax.swing.JFrame;

public class ChessGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Game");
        ChessBoardPanel boardPanel = new ChessBoardPanel();
        frame.add(boardPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
}
