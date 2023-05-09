package hw2.task2;

public class Average {
	public static void main(String[] args) {

		float sum = 0f;
		for (String arg : args) {
			sum += Float.parseFloat(arg);
		}

		float average = sum/args.length;

		System.out.println(Math.round(average*100)/100f);

	}
}