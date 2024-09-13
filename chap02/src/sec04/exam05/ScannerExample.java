package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" + inputData + "\"");
			
			// 입력된 값이 "Q"일 경우 while 반복문 종료
			if (inputData.equals("q")) {
				break;
			}
		}

		System.out.println("종료");
		scanner.close();
		
	}

}
