public class Average {
	public static void main(String[] args) {

		float sum = 0f;
		for(int i=0; i<args.length; i++) {
			sum += Float.valueOf(args[i]);
		}

		float average = sum/args.length;

		System.out.println(Math.round(average*100)/100f);

	}
}