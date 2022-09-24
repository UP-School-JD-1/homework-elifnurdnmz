package part2chapter8q1;

import java.util.function.IntConsumer;

public class EvenNumber {
	private static int sum = 0;
	private static int product = 1;
	private static int[] squares = new int[10];

	public static void main(String[] args) {
		IntConsumer printer = (i) -> System.out.print(i + " ");
		doEvenNumberOperation(printer, 15);

		System.out.println();

		IntConsumer add = a -> sum += a;
		doEvenNumberOperation(add, 15);
		System.out.println("Sum : " + sum);

		IntConsumer multi = a -> product *= a;
		doEvenNumberOperation(multi, 15);
		System.out.println("Multiply : " + product);

		IntConsumer squareOp = a -> squares[a / 2 - 1] = a * a;
		doEvenNumberOperation(squareOp, 20);

		System.out.print("Squares: ");
		for (int a : squares)
			printer.accept(a);

	}

	public static void doEvenNumberOperation(IntConsumer operation, int n) {
		for (int a = 1; a <= n; a++)
			if (a % 2 == 0)
				operation.accept(a);
	}
}