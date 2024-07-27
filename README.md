# AI Chess

## Project Overview

This project is a simple chess game implemented in Java. The application has a basic graphical user interface (GUI),  allowing two players to play chess against each other. The logic of the game meets the rules of chess, including piece captures and movements.


# Project Structure
This project contiains of several Java classes:

* Main.java: The entry of the application, responsible for launching the game/GUI.
* ChessGUI.java: Sets up the graphical interface, such as the chessboard, as well as controls moves.
* ChessBoardPanel.java: Handles the rendering of the chessboard and pieces.
* Game.java: Manages new moves which change the game, this involves validating and making moves.
* Board.java: Represents the chessboard and manages every piece’s positioning.
* Piece.java:Base class for all chess pieces.
* King.java: designed for the King piece/movement.
* Move.java: Represents a move on the chessboard.

## Improvements in Future Work (currently working on)
* Piece-Specific Classes: Extra pieces (Pawn, Knight, Bishop, Rook, Queen) should be implemented, in classes, to complete the game.
* Check/Checkmate: The addition of check, checkmate, and stalemate scenarios would improve the game and gameplay.
* AI Player: An AI opponent can be an option, rather than just 2 players, using a basic algorithm.

## Playing Instructions:
Begin the game: Run the Main class to launch the GUI.
Enter Moves: Use the text field, seen at the bottom of the screen,  to input your moves in standard chess notation (e.g., "e2 e4").
Make Moves: Click the "Make Move" button to execute the move. The board automatically updates.
