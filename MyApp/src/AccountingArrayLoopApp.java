
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueofsupply = Double.parseDouble(args[0]); 
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueofsupply*vatRate;
		double total = valueofsupply + vat;
		double expense = valueofsupply*expenseRate;
		double income = valueofsupply-expense;
		
		
		System.out.println("Value of supply : "+valueofsupply);
		System.out.println("VAT : "+vat );
		System.out.println("Total : "+total );
		System.out.println("Expense : "+expense );
		System.out.println("Income : "+income );
		
		//배열
		double[] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		//반복문
		int i = 0;
		while(i < dividendRates.length) {
		System.out.println("Dividend : "+ income*dividendRates[i]);
			i = i + 1;
		}
		
	}

}
