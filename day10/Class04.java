package day10;

public class Class04 {

	public static void main(String[] args) {
		Card c = new Card();
		c.print();
		c.setShape('♣');
		c.setNum(13);
		c.print();
	}

}

//모양♥◆♠♣
//숫자 1~13
//생성자:하트1
//모양/숫자가 들어올 수 없는 값이 들ㅇ오면 하트1

class Card {
	private char shape; // 모양
	private int num; // 숫자

	// 생성자
	public Card() {
		shape = '♥';
		num = 1;
	}

	void print() {
		System.out.print(shape);
		switch (num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥': case '◆': case '♠': case '♣':
			this.shape = shape;
			break;
		default :
			this.shape = '♥';
		}
		
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num>0 && num<14) {
			this.num = num;
		}else {this.num=1;}
	}

}