package day12;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product("버거1", "3000원");
		Product[] p2 = new Product[10];
		Scanner sc = new Scanner(System.in);
		p2[0] = p1;

		for (int i = 1; i < p2.length; i++) {
			System.out.println("계속 추가? [y/n]");
			if (sc.next().equals("n"))
				break;

			System.out.println("추가할 메뉴 이름 입력");
			String menu = sc.next();
			System.out.println("추가할 메뉴의 가격 입력");
			String price = sc.next();
			p2[i] = new Product();
			p2[i].addMenu(menu, price);
		}

		System.out.println("현재 상품 리스트");
		for (Product i : p2) {
			if (i != null)
				i.printMenu();
		}

	}

}