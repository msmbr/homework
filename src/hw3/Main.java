package hw3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Hw3 hw3 = new Hw3();

		System.out.println("task 1");
		hw3.forPrintOddNumbersFrom1to99();

		System.out.println("\ntask 2");
		hw3.forPrintFactorial(5);

		System.out.println("\ntask 3_1");
		hw3.whilePrintOddNumbersFrom1to99();
		System.out.println("task 3_2");
		hw3.whilePrintFactorial(5);

		System.out.println("\ntask 4_1");
		hw3.doWhilePrintOddNumbersFrom1to99();
		System.out.println("task 4_2");
		hw3.doWhilePrintFactorial(5);

		System.out.println("\ntask 5");
		hw3.printPowN(2, 3);

		System.out.println("\ntask 6");
		hw3.printSequenceFrom0Len10StepMinus5();

		System.out.println("\ntask 7");
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		double x = scan.nextDouble();
		hw3.printMultiplicationTable(x);

		System.out.println("\ntask 8");
		hw3.printOddsLen10CSV();

		int[] arr = {4, -5, 0, 6, 8};

		System.out.println("\ntask 9");
		hw3.printMin(arr);

		System.out.println("\ntask 10");
		hw3.printMax(arr);

		System.out.println("\ntask 11");
		hw3.printRearrangeMinMaxArray(arr);
	}
}