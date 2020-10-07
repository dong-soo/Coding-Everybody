
public class LoopArray {

	public static void main(String[] args) {

		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		// i<users.length; 이렇게하면 유동적으로 계속 추가되도 오류안남
		for(int i=0; i<users.length; i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		
	}

}
