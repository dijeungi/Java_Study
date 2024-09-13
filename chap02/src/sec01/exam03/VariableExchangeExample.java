package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		/* 설명
		 * 1. 변수 x 값 3을 변수 temp 에 저장
		 * 2. 변수 y 값 5를 x에 저장
		 * 3. 변수 temp 값 3을 변수 y에 저장
		 * 
		 * x(3) > temp(3) 
		 * y(5) > x(5)
		 * temp(3) > y(3)
		 * = x(5), y(3), temp(3)
		 */
	}
}
