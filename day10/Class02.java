package day10;

public class Class02 {

	public static void main(String[] args) {
		// 자동차 클래스
		// 멤버변수
		// 메서드 : 전원, 스피드up,스피드down

		Car car = new Car("아반떼");
		car.start();
		car.carInfo();
		car.acc();
		car.acc();
		car.acc();
		car.brk();
		car.brk();
		car.brk();
		car.brk();
		
		car.start();
		car.acc();
		
	}

}

class Car {
	private String model;
	private String color = "";
	private boolean run;
	private int speed;

	public Car() {
	};

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, String color) {
		this(model);
		this.color = color;
	}
	
	void carInfo() {
		System.out.println("차종 : "+model+" "+color);
		
	}

	void start() {
		setRun((isRun()) ? false : true);
		System.out.println("시동이 " + (isRun() ? "켜집니다." : "꺼집니다."));
	}

	void acc() {
		if(isRun()) {
			setSpeed(getSpeed() + 10);
			System.out.print("가속중 ");
			System.out.println("현재 속도 : " + getSpeed());
		}else {System.out.println("가속 실패. 시동을 켜주세요.");}
	}
	
	void brk() {
		if(getSpeed()<=0) {
			setSpeed(0);
			return;
		}
		setSpeed(getSpeed()-10);
		System.out.print("감속중 ");
		System.out.println("현재 속도 : " + getSpeed());
		if(getSpeed()<=0) System.out.println("정지");
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isRun() {
		return run;
	}

	public void setRun(boolean run) {
		this.run = run;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}