package application;

import chess.ChessException2;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Origem: ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.print("Destino: ");
                ChessPosition target = UI.readChessPosition(sc);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
            catch (ChessException2 e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch (InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
