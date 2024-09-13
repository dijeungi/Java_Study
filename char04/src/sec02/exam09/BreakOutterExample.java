package sec02.exam09;

public class BreakOutterExample {
	public static void main(String[] args) {

		// Qutter: 은 라벨이라고 하며, 주로 중첩된 반복문이나 
		// break 나 continue 같은 키워드를 사용할 때 특정 반복문을 빠져나가기 위해 사용됨
		Outter: for(char upper= 'A'; upper <= 'Z'; upper++) {
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}