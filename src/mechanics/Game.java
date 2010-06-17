package mechanics;

import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game {

	public static void main(String[] args) throws Exception {
		Board board = new Board();
		Alby ai = new Alby();
		System.out.println(board);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s;
		while (true) {
			br.readLine();
			board.makeMove(ai.findNextMove(board, Board.BLACK, 3));
			System.out.println(board);
			br.readLine();
			board.makeMove(ai.findNextMove(board, Board.WHITE, 3));
			System.out.println(board);
//			s = br.readLine().split(" ");
//			if (s.length == 3)
//				board.makeMove(new Move(new Group(convCell(s[0])),
//						convDir(s[1]), convSide(s[2])));
//			else
//				board.makeMove(new Move(new Group(convCell(s[0]),
//						convCell(s[1])), convDir(s[2]), convSide(s[3])));
//			System.out.println(board);
//			System.out.println(ai.evaluatePosition(board, Board.WHITE));
//			board.makeMove(ai.findNextMove(board, Board.BLACK));
//			System.out.println(board);
//			System.out.println(ai.evaluatePosition(board, Board.WHITE));
		}
	}

	public static Direction convDir(String s) {
		if (s.equals("NW"))
			return Direction.NorthWest;
		else if (s.equals("N"))
			return Direction.North;
		else if (s.equals("E"))
			return Direction.East;
		else if (s.equals("SE"))
			return Direction.SouthEast;
		else if (s.equals("S"))
			return Direction.South;
		else
			return Direction.West;
	}

	public static Cell convCell(String s) {
		return new Cell((int) s.charAt(0) - (int) 'A' + 1, Integer
				.parseInt(Character.toString(s.charAt(1))));
	}

	public static byte convSide(String s) {
		if (s.equals("W"))
			return Board.WHITE;
		else
			return Board.BLACK;
	}
}