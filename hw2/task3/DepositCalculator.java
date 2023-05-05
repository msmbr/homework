
public class DepositCalculator {
	public static void main(String[] args) {

		double deposit = Double.valueOf(args[0]);
		float percent = Float.valueOf(args[1])/100;
		float years = Float.valueOf(args[2]);
		int periods = args.length==3?12:Integer.valueOf(args[3]); //fourth parameter - number of times interest is compounded per year
		double balance = deposit;
		double yearIncome = 0d;
		String incomesByPeriods = "";


		double[] incomeByPeriodArr = getIncomeByPeriodsArr(deposit, percent, periods, years);

		for(int i=0; i<incomeByPeriodArr.length; i++) {
			
			yearIncome += incomeByPeriodArr[i];
			incomesByPeriods = incomesByPeriods+(i%periods+1)+"(+"+Math.floor(incomeByPeriodArr[i]*100)/100+")  ";
			
			//out for each year and incomplete year
			if((i+1)%periods==0 || ((i+1)%periods!=0 && i==incomeByPeriodArr.length-1)) {
				System.out.println(String.format("Накопичена сума грошей за %sй рік: %s грн.", i/periods+1, Math.floor(yearIncome*100)/100));
				System.out.println("Період року(дохід): "+incomesByPeriods+"\n");
				yearIncome = 0d;
				incomesByPeriods = "";
			}

		}
		
		double compoundInterest = calculateCompoundInterest(deposit, percent, periods, years);
		System.out.println("Нараховані складині відсотки: " + Math.floor(compoundInterest*100)/100 + " грн.");
	}

	private static double calculateCompoundInterest(double deposit, float percent, int periods, float years) {
		return deposit*Math.pow((1+percent/periods), periods*years);
	}

	private static double[] getIncomeByPeriodsArr(double deposit, float percent, int periods, float years) {
		double balance = deposit;
		double compoundInterest = 0d;
		double[] arrCompoundInterest = new double[(int)(years*periods)];
		for(int j=0; j<arrCompoundInterest.length; j+=1) {
			compoundInterest = calculateCompoundInterest(balance, percent, periods, 1f/periods);
			arrCompoundInterest[(int)j] = compoundInterest-balance;
			balance = compoundInterest;
		}
		return arrCompoundInterest;
	}

	//not used
	private static double[] getCompoundInterestByPeriodArr(double deposit, float percent, int periods, float years) {
		double[] arrCompoundInterest = new double[(int)(years*12)];
		for(float i=1f/periods, j=0; i<=years; i+=1f/periods, j=j+1) {
			arrCompoundInterest[(int)j] = calculateCompoundInterest(deposit, percent, periods, i);
		}
		return arrCompoundInterest;
	}
}

