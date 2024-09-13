package sec04.exam04;

public class QStopExample {
	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			if(keyCode == 113) {
				System.out.println("키보드 'Q'가 인식되었습니다.");
				break;
			}
		}

		System.out.println("종료");
		
	}

}
