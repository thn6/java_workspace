package day08;


import java.util.Scanner;

public class 과제 {
	static Scanner sc = new Scanner(System.in);

	// 컴퓨터 번호 3개를 랜덤으로 중복없이 받아서 배열에 저장하고 리턴
	int[] getComNum() {
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (a[j] == a[i]) {
					i--;
					break;
				}
			}
		}
		return a;
	}

	// 스캐너로 숫자 3개를 입력받으면 배열에 저장하고 리턴
	int[] getUserNum() {
		System.out.println("숫자 입력 ex)9 2 4");
		String a = sc.nextLine();
		String[] b = a.split(" ");
		int[] c = new int[3];
		for (int i = 0; i < 3; i++) {
			c[i] = Integer.parseInt(b[i]);
		}
		return c;
	}

	// 컴퓨터와 나의 숫자 배열을 매개변수로 받아서 결과값을 배열에 저장하고 리턴
	// (결과값 배열 : [0]=스트라이크,[1]볼,[2]아웃)
	int[] check(int[] a, int[] b) {
		int[] c = { 0, 0, 0 };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i] == b[j]) {
					if (a[i] == b[i]) {
						c[0]++; // 스트라이크
						break;
					} else {
						c[1]++; // 볼
						break;
					}
				}
				if (j == 2)
					c[2]++; // 아웃
			}
		}
		System.out.print("나의 숫자 : ");
		for (int tmp : b) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.print("(테스트용)컴퓨터의 숫자 : "); // 테스트를 위한 정답
		for (int tmp : a) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		if (c[2] == 3)
			System.out.print("OUT");
		if (c[0] != 0)
			System.out.print(c[0] + "S ");
		if (c[1] != 0)
			System.out.print(c[1] + "B");
		System.out.println();
		System.out.println("====================================");
		return c;
	}

	public static void main(String[] args) {
		과제 b = new 과제();
		int[] com = b.getComNum();
		int cnt = 0;
		while (true) {
		cnt ++;	
			int[] me = b.getUserNum();
			int[] res = b.check(com, me);
			if (res[0] == 3) {
				System.out.println("정답");
				System.out.println("시행 횟수 : "+cnt);
				return;
			}
		}
	}

}
