package JPractice;

import java.util.Scanner;

public class JPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("안녕");
		
		// 입력
		System.out.println("숫자를 입력하세요.");
		int left = sc.nextInt();
		System.out.println("숫자를 한번 더 입력하세요.");
		int right = sc.nextInt();
		// 출력
		System.out.println("입력한 숫자: " + left + "," + right);
		
	}

}
