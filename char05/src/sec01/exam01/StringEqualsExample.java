package sec01.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {

		String strVar1 = "신민철";
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같습니다.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다릅니다.");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println();
		}
		
		
	}

}
