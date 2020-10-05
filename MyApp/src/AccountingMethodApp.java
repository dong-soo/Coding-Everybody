
public class AccountingMethodApp {
	public static double valueofsupply;
	public static double vatRate;
	public static double expenseRate; 
	public static void main(String[] args) {
		
		valueofsupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		print();
	}

	private static void print() {
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+ getTotal());
		System.out.println("Expense : "+ getExpense());
		System.out.println("Income : "+ getIncome());
		System.out.println("Dividend 1 : "+ getDiviend1());
		System.out.println("Dividend 2 : "+ getDiviend2());
		System.out.println("Dividend 3 : "+ getDiviend3());
	}

	private static double getDiviend1() {
		return getIncome() * 0.5;
	}
	private static double getDiviend2() {
		return getIncome() * 0.3;
	}
	private static double getDiviend3() {
		return getIncome() * 0.2;
	}
	private static double getIncome() {
		return valueofsupply*getExpense();
	}

	private static double getExpense() {
		return valueofsupply-expenseRate;
	}

	private static double getTotal() {
		return valueofsupply + getVAT();
	}

	private static double getVAT() {
		return valueofsupply*vatRate;
	}

}
