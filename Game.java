import java.util.Scanner;

public class Game {
    Board board;
    boolean whiteTurn;

    public Game() {
        board = new Board();
        whiteTurn = true;
    }

    public void play() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                board.printBoard();
                System.out.println((whiteTurn ? "White" : "Black") + "'s turn");

                System.out.print("Enter move (e.g., e2 e4): ");
                String move = scanner.nextLine();
                String[] parts = move.split(" ");

                int startX = parts[0].charAt(0) - 'a';
                int startY = parts[0].charAt(1) - '1';
                int endX = parts[1].charAt(0) - 'a';
                int endY = parts[1].charAt(1) - '1';

                if (board.movePiece(startX, startY, endX, endY)) {
                    whiteTurn = !whiteTurn;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }
        }
    }
}
