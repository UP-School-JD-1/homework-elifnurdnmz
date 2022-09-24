package part2chapter8q2;

import java.util.function.BinaryOperator;

public class Test {

	public static void main(String[] args) {
		Book book1 = new Book("Science Fiction", "Dune", "	Frank Herbert", 700);
		Book book2 = new Book("Novel", "Tutunamayanlar", "Oğuz Atay", 671);
		BinaryOperator<Integer> op = BinaryOperator.maxBy((a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1));

		System.out.println(op.apply(book1.getPageNumber(), book2.getPageNumber()));

	}
}