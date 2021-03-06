package game;

import engine.CGTSolver;
import engine.OutcomeType;

public class Controller {

	public static void main(String[] args) {
//		Board board = new Board(6, 6, false);
		
		Board board = new Board(new Piece[][] {
			{null, null, new Piece(0, 2, true), null},
			{new Piece(1, 0, false), null, null, null},
			{new Piece(2, 0, true), null, null, new Piece(2, 3, false)},
			{null, null, null, null}
		});
		
		System.out.println(board.getBoardRepresentation());
		
		CGTSolver solver = new CGTSolver();
//		AlphaBetaSolver solver = new AlphaBetaSolver();
		
		OutcomeType result = solver.solve(board, true);
		
		System.out.println(result);
	}
}
