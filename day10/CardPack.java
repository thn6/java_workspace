package day10;

public class CardPack {
	//필드: 52장의카드들을 담을수있는배열
	//생성자:52장의 카드를 생성
	//메서드:카드 섞기/카드한장빼기/출력 : Card클래스 print메서드/카드초기화메서드
	
	
	//필드
	private Card[] pack = new Card[52];
	private int cnt = 0; //pack 배열의 index를 체크하는 용도
	
	
	//생성자
	public CardPack() {
		char shape='♥';
		for(int i=1;i<=4;i++) {
			switch(i) {
			case 1: shape='♥';break;
			case 2: shape='◆';break;
			case 3: shape='♠';break;
			case 4: shape='♣';break;
			}
			for(int j=1;j<=13;j++) {
				Card c = new Card();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
		
		
	}


	
	
	
	//메서드
	void shuffle() {
		for(int i=0;i<pack.length;i++) {
			int r = (int)(Math.random()*52);
			Card tmp = pack[i];
			pack[i] = pack[r];
			pack[r] = tmp;
		}
	}

	Card pick() {
		cnt--;
		if(cnt<0) {
			cnt=0;
			return null;
		}
		return pack[cnt];
	}
	
	void reset() {
		cnt = 52;
	}

	
	
	
	//게세
	public Card[] getPack() {
		return pack;
	}


	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	
	
}
