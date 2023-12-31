package day08;

public class Lotto {
	static int cnt2 = 0;

	// 번호 생성후 배열에 저장하는 메서드
	int[] lotto(int size) {
		int[] num = new int[size];
		for (int i = 0; i < size; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (num[j] == num[i]) {
						i--;
					}
				}
			}
		}
		return num;
	}

	// 배열 2개를 받아서 값 비교하는 메서드
	void check(int[] arr1, int[] arr2) {
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					cnt++;
				}
			}
		}
		System.out.print("내 번호 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.print("당첨 번호 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println("[" + arr2[6] + "]");
		System.out.print("결과 : ");

		switch (cnt) {
		case 6:
			for (int i = 0; i < 6; i++) {
				if (arr1[i] == arr2[6]) {
					System.out.println("2등 당첨");
				} else {
					System.out.println("1등 당첨");
				}
			}
			cnt2++;
			break;
		case 5:
			System.out.println("3등 당첨");
			cnt2++;
			break;
		case 4:
			System.out.println("4등 당첨");
			break;
		case 3:
			System.out.println("3등 당첨");
			break;
		default:
			System.out.println("꽝");
		}

	}

	public static void main(String[] args) {
		// 로또번호 생성 (1~45까지 랜덤생성)
		// 사용자 : 6개선택 , 추첨 : 6+1개
		// 로또 등수 확인 1등 : 6자리 일치, 2등 : 5자리 일치+보너스번호 일치, 3등 5자리, 4등 4자리, 5등 3자리
		Lotto lotto = new Lotto();

		// 3등 이상 나올 때 까지 반복
		for (int i = 1; cnt2 < 1; i++) {
			lotto.check(lotto.lotto(6), lotto.lotto(7));
			System.out.println("사용 금액 : " + i*1000 + "원");
		}
	}

}
