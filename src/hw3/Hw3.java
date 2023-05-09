package hw3;

import java.util.Arrays;

public class Hw3 {
	public void forPrintOddNumbersFrom1to99() {
		for(int i=1; i<100; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public void forPrintFactorial(int n) {
		int result = 1;
		for(int i=1; i<n+1; ++i) {
			result *= i;
		}
		System.out.println(result);
	}

	public void whilePrintOddNumbersFrom1to99() {
		int i=1;
		while(i<100) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
	}

	public void whilePrintFactorial(int n) {
		int result = 1;
		int i=1;
		while(i<n+1) {
			result = result*i;
			++i;
		}
		System.out.println(result);
	}

	public void doWhilePrintOddNumbersFrom1to99() {
		int i=1;
		do {
			System.out.print(i+" ");
			i+=2;
		} while(i<100);
		System.out.println();
	}

	public void doWhilePrintFactorial(int n) {
		int result = 1;
		int i=1;
		do {
			result = result*i;
			++i;
		} while(i<n+1);
		System.out.println(result);
	}

	public void printPowN(int x, int n) {
		// System.out.println(Math.pow(x, n));
		if(n==0){
			System.out.println(1);
			return;
		}
		int result = 1;
		for(int i=0; i<n; ++i) {
			result=result*x;
		}
		System.out.println(result);
	}

	public void printSequenceFrom0Len10StepMinus5() {
		for(int i=0; i<10; ++i) {
			System.out.print((-5*i)+" ");
		}
		System.out.println();
	}

	public void printMultiplicationTable(double x) {
		for(int i=1; i<11; ++i) {
			System.out.println(String.format("%s x %s = %s", x, i, Math.floor(x*i*100)/100));
		}
	}

	public void printOddsLen10CSV(){
		int[] arr = new int[10];
		String csv = "";
		for(int i=0; i<10; ++i) {
			arr[i] = i*2+1;
		}
		for(int i=0; i<10; ++i) {
			csv = csv + arr[i] + ",";
		}

		System.out.println(csv.substring(0, csv.length()-1));
		
	}

	public void printMin(int[] arr) {
		System.out.println(getMin(arr));
	}

	public void printMax(int[] arr) {
		System.out.println(getMax(arr));
	}

	public int getMin(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; ++i) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public int getMax(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; ++i) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public void printRearrangeMinMaxArray(int[] arr) {
		int min = getMin(arr);
		int max = getMax(arr);
	
		for(int i=0; i<arr.length; ++i) {
			if(arr[i]==min) {
				arr[i] = max;
				continue;
			}
			if(arr[i]==max) {
				arr[i] = min;
				continue;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}