
public class AuthApp {

	public static void main(String[] args) {

		System.out.println(args [0]);
			
		String id = "egoing";
		String pass = "1111";
		String inputId = args[0];
		String inputpass = args[1];
		
		System.out.println("Hi.");
		
		//if(inputId == id) {
//		if(inputId.equals(id)) {
//			if(inputpass.equals(pass)) {
//				System.out.println("Master!");
//		} else {
//			System.out.println("Wrong password!");
//
//		}
//			System.out.println("Who are you?");
//		}
		
		//&& 연산자 앞에랑 뒤에가 참이면~ (둘다맞으면~)
		if(inputId.equals(id) && inputpass.equals(pass)) {
			System.out.println("Master!");
		} else {
		
			System.out.println("Who are you?");
		}
	}
}
