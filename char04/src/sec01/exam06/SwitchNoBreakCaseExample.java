package sec01.exam06;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {

		// 8 ~ 11 사이의 정수 뽑기
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("[현재 시각: " + time + " 시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		case 11:
			System.out.println("외근을 나갑니다.");
			break;
		}
		
	}

}
